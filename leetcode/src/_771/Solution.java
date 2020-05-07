package _771;

import java.util.*;

/**
 * 771. 宝石与石头
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */

public class Solution {
    public static void main(String[] args) {
        numJewelsInStones("aA","aAA");
    }

    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i)))
                num++;
        }
        return num;
    }
}
