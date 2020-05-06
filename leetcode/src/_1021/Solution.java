package _1021;

/**
 *1021 删除最外层的括号
 *https://leetcode-cn.com/problems/remove-outermost-parentheses/
 */

public class Solution {
    public String removeOuterParentheses(String S) {
        StringBuffer stringBuffer = new StringBuffer();
        int counter = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (counter > 0) stringBuffer.append(S.charAt(i));
                counter++;
            } else {
                if (counter > 1) stringBuffer.append(S.charAt(i));
                counter--;
            }
        }
        return stringBuffer.toString();
    }
}
