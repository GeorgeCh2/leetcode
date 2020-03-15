package life.codecook.leetcode.easy;

/**
 * 宝石和石头
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 15:28
 */
public class NumJewelsInStones {
	public static int numJewelsInStones(String J, String S) {
		int res = 0;

		for (String stone : S.split("")) {
			if (J.contains(stone)) {
				res++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		numJewelsInStones("z", "ZZ");
	}
}
