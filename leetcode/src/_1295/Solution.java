package _1295;

import java.util.HashSet;
import java.util.Set;

/**
 * 1295. 统计位数为偶数的数字
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 */

public class Solution {
    public static void main(String[] args) {
    }

    public int findNumbers(int[] nums) {
        int sum = 0;
        String string;
        for (int num : nums) {
            string = String.valueOf(num);
            if (string.length() % 2 == 0)
                sum++;
        }
        return sum;
    }
}
