package life.codecook.leetcode.easy;

/**
 * 二进制链表转整数
 *
 * @author zhouzhi@qbb6.com
 * @date 2020-04-19 16:19
 */
public class GetDecimalValue {
	public static int getDecimalValue(ListNode head) {
		StringBuilder str = new StringBuilder();

		while (head != null) {
			str.append(head.val);
			head = head.next;
		}

		return Integer.valueOf(str.toString(), 2);
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(0);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(1);
		getDecimalValue(head);
	}
}
