package life.codecook.leetcode.array.easy;

/**
 * 奇数值单元格的数目
 *
 * @author georgechmr@gmail.com
 * @date 2020-05-30 16:03
 */
public class OddCells {
	static int oddCells(int n, int m, int[][] indices) {
		int res = 0;
		int[][] temp = new int[n][m];

		for (int[] index : indices) {
			for (int x = 0; x < m; x++) {
				temp[index[0]][x] += 1;
			}
			for (int y = 0; y < n; y++) {
				temp[y][index[1]] += 1;
			}
		}

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				res += temp[x][y] % 2 == 0 ? 0 : 1;
			}
		}

		return res;
	}
}
