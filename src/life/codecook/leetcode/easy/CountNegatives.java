package life.codecook.leetcode.easy;

/**
 * 统计有序矩阵中的负数
 *
 * @author zhouzhi@qbb6.com
 * @date 2020-04-19 16:36
 */
public class CountNegatives {
	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int[] ints : grid) {
			for (int j = ints.length - 1; j >= 0; j--) {
				if (ints[j] < 0) {
					count++;
				} else {
					break;
				}
			}
		}

		return count;
	}
}
