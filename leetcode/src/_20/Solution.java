package _20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid(")"));
    }

    public static boolean isValid(String s) {
        //建立规则对应表
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack stack = new Stack();

        if (s.length() % 2!=0) return false;
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //如果为左括号，则入栈
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
                //为右括号
                //栈为空无左括号匹配返回false
            else if (stack.isEmpty()) return false;
                //栈不为空，匹配左括号不正确返回false
            else if (map.get(stack.pop()) != s.charAt(i)) {
                return false;
            }
        }
        //以上都正确，但栈中还有左括号没匹配则返回false
        if (!stack.isEmpty()) return false;
        //其余正确
        return true;
    }
}
