package _0507;

/**
 * 面试题 02.03. 删除中间节点
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class M0203 {
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
