package life.codecook.leetcode.easy;

/**
 * 解压缩编码列表
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 14:21
 */
public class DecompressRLElist {

	public static int[] decompressRLElist(int[] nums) {
		int resLength = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {
			resLength += nums[i];
		}

		int[] res = new int[resLength];
		int resIndex = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {
			for (int j = 0; j < nums[i]; j++) {
				res[resIndex] = nums[i+1];
				resIndex++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4};
		decompressRLElist(nums);
	}
}
