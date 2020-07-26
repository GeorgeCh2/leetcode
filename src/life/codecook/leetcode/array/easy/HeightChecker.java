package life.codecook.leetcode.array.easy;

/**
 * 高度检查器
 *
 * @author georgechmr@gmail.com
 * @date 2020-07-26 11:08
 */
public class HeightChecker {
	public int heightChecker(int[] heights) {
		int[] arr = new int[101];
		int count = 0;

		// 统计各高度对应的人数
		for (int height : heights) {
			arr[height]++;
		}

		for (int i = 1, j = 0; i < arr.length; i++) {
			while (arr[i]-- > 0) {
				if (heights[j++] != i) {
					count++;
				}
			}
		}

		return count;
	}
}
