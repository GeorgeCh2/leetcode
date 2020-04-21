package life.codecook.leetcode.easy;

/**
 * 删除链表中的节点
 *
 * @author georgechmr@gmail.com
 * @date 2020-04-19 16:02
 */
public class DeleteNode {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
