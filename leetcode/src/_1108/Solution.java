package _1108;

/**
 * 1108. IP 地址无效化
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 */

public class Solution {
    public static void main(String[] args) {
        defangIPaddr("1.1.1.1");
    }

    public static String defangIPaddr(String address) {
        String s = address.replace(".", "[.]");
        return s;
    }
}
