package _m58;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题58 - II. 左旋转字符串
 *  https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */

public class Solution {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0, n);
        String s2 = s.substring(n);
        return s2 + s1;
    }
}
