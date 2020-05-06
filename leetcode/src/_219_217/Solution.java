package _219_217;

import java.util.*;


public class Solution {
    /**
     * 217. 存在重复元素
     * https://leetcode-cn.com/problems/contains-duplicate/
     */

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    /**
     * 219. 存在重复元素 II
     * https://leetcode-cn.com/problems/contains-duplicate-ii/
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= Math.min(k, nums.length - i); j++) {
                if (i + j >= nums.length) break;
                if (nums[i] == nums[i + j]) return true;
            }
        }
        return false;
    }

    //hashmap时间效率优化
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index == null) {
                map.put(nums[i], i);
            } else if (i - index <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    /**
     * 220. 存在重复元素 III
     * https://leetcode-cn.com/problems/contains-duplicate-iii/
     */
    //二叉搜索树
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Long[] list =new Long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list[i] = Long.valueOf(nums[i]);
        }
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < list.length; i++) {
            Long ceiling = set.ceiling(list[i]);
            if (ceiling != null && ceiling <= list[i] + t) return true;
            Long floor = set.floor(list[i]);
            if (floor != null && floor >= list[i] - t) return true;

            set.add(list[i]);
            if (set.size() > k)
                set.remove(list[i - k]);
        }
        return false;
    }



}
