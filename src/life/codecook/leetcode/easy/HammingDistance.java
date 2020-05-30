package life.codecook.leetcode.easy;

/**
 * 汉明距离
 *
 * @author georgechmr@gmail.com
 * @date 2020-04-28 10:27
 */
public class HammingDistance {

	public static int hammingDistance(int x, int y) {
		int res = 0;
		char[] xHexChar = Integer.toBinaryString(x).toCharArray();
		char[] yHexChar = Integer.toBinaryString(y).toCharArray();

		for (int i = 0; i < (xHexChar.length > yHexChar.length ? xHexChar.length : yHexChar.length); i++) {
			res += xHexChar[i] == yHexChar[i] ? 0 : 1;
		}

		return res;
	}

	public static void main(String[] args) {
		hammingDistance(1, 4);
	}
}
