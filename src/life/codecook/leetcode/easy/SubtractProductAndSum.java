package life.codecook.leetcode.easy;

/**
 * 整数的各位积和之差
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 14:48
 */
public class SubtractProductAndSum {
	public static int subtractProductAndSum(int n) {
		int sub = 1;
		int sum = 0;

		while (n > 0) {
			int i = n % 10;
			sub *= i;
			sum += i;
			n /= 10;
		}

		return sub - sum;
	}

	public static void main(String[] args) {
		int i = subtractProductAndSum(114);
	}
}
