package life.codecook.leetcode.easy;

import java.util.Arrays;

/**
 * 猜数字
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 15:03
 */
public class Game {
	public static int game(int[] guess, int[] answer) {
		int res = 0;
		if (Arrays.equals(guess, answer)) {
			return 3;
		}

		for (int i = 0; i < 3; i++) {
			res += guess[i] == answer[i] ? 1 : 0;
		}

		return res;
	}

	public static void main(String[] args) {
		int[] guess = new int[]{1,2,3};
		int[] answer = new int[]{1,2,3};
		game(guess, answer);
	}
}
