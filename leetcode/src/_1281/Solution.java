package _1281;

import java.util.HashMap;
import java.util.Map;

/**
 * 1281. 整数的各位积和之差
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

public class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int temp = 0;
        int sum1 = 1;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = Integer.valueOf(s.substring(i, i + 1));
            sum1 = sum1 * temp;
            sum2 = sum2 + temp;
        }
        return sum1 - sum2;
    }
}
