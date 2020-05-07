package _0507;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1389. 按既定顺序创建目标数组
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 */
public class _1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }
}
