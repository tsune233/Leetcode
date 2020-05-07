package _0507;

import java.util.LinkedList;
import java.util.List;

/**
 * 1389. 按既定顺序创建目标数组
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 */
public class _237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
