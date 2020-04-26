package life.codecook.leetcode.easy;

import life.codecook.leetcode.moudle.TreeNode;

/**
 * 二叉搜索树的范围和
 *
 * @author georgechmr@gmail.com
 * @date 2020-04-26 20:55
 */
public class RangeSumBST {
	/**
	 * 深度优先搜索
	 * @param root
	 * @param L
	 * @param R
	 * @return
	 */
	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null) {
			return 0;
		}

		if (root.val < L) {
			return rangeSumBST(root.right, L, R);
		}

		if (root.val > R) {
			return rangeSumBST(root.left, L, R);
		}

		return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
	}
}
