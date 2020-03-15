package life.codecook.leetcode.easy;

/**
 * 统计位数为偶数的数字
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 15:11
 */
public class FindNumbers {
	public static int findNumbers(int[] nums) {
		int res = 0;
		for (int num : nums) {
			if (digits(num, 0) % 2 == 0) {
				res++;
			}
		}

		return res;
	}

	private static int digits(int num, int digit){
		if (num > 0) {
			return digits(num/10, ++digit);
		} else {
			return digit;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{555,901,482,1771};
		findNumbers(nums);
	}
}
