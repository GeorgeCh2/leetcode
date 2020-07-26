package life.codecook.leetcode.array.easy;

/**
 * 0~n-1中缺失的数字
 *
 * 排序数组中的搜索问题，首先想到 '二分法' 解决
 * @author georgechmr@gmail.com
 * @date 2020-07-26 16:26
 */
public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int i = 0;
		int j = nums.length - 1;

		while (i <= j) {
			int m = (i + j) / 2;
			if (nums[m] == m) {
				i = m + 1;
			} else {
				j = m - 1;
			}
		}

		return i;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,3,4,5,6,7,9};
		missingNumber(nums);
	}
}
