package _0507;

import java.util.*;

/**
 *
 *
 */
public class _1365 {
    public static void main(String[] args) {
        int[] nums ={8, 1, 2, 2, 3};
        smallerNumbersThanCurrent2(nums);
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int sum =0 ;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j])
                    sum++;
            }
            list.add(sum);
        }
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    //排序 + 映射 时间复杂度 O(nlog(n))，空间复杂度 O(n)
    public static int[] smallerNumbersThanCurrent1(int[] nums) { // 8, 1, 2, 2, 3
        int len = nums.length;
        Map<Integer, Set<Integer>> valueIndex = new HashMap<>(len); // 预存每个值与索引对应
        for (int i = 0; i < len; i++) {
            if (!valueIndex.containsKey(nums[i])) valueIndex.put(nums[i], new HashSet<>());
            valueIndex.get(nums[i]).add(i);
        }
        int[] sortedArr = Arrays.copyOf(nums, len), res = new int[len];
        Arrays.sort(sortedArr); // 1, 2, 2, 3, 8
        for (int si = len - 1; si >= 0; si--) { // 倒序，方便处理同值的情况
            for (int i : valueIndex.get(sortedArr[si])) res[i] = si; // 同值的所有索引都更新
        }
        return res;
    }


    //计数排序 时间复杂度 O(n)，空间复杂度 O(1)
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        // 统计出现频率 frequency
        int[] freq = new int[101]; // 索引即数值
        for (int num : nums) freq[num]++;

        // 对频率(而非对原数组nums)从前到后累加
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        // 输出结果
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] > 0) res[i] = freq[nums[i] - 1];
        }
        return res;
    }

}
