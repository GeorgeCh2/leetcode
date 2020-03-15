package life.codecook.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 有多少小于当前数字的数字
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 13:10
 */
public class SmallerNumbersThanCurrent {

	/**
	 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
	 *
	 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
	 *
	 * 以数组形式返回答案。
	 */
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		// 标记每一位小于的数量
		Map<Integer, Integer> smallMap = new HashMap<>();

		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					smallMap.put(i, smallMap.get(i) == null ? 1 : (smallMap.get(i) + 1));
				} else if (nums[j] > nums[i]){
					smallMap.put(j, smallMap.get(j) == null ? 1 : (smallMap.get(j) + 1));
				}
			}
			res[i] = smallMap.get(i) == null ? 0 : smallMap.get(i);
		}
		res[nums.length-1] = smallMap.get(nums.length - 1) == null ? 0 : smallMap.get(nums.length - 1);

		return res;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{8,1,2,2,3};
		smallerNumbersThanCurrent(nums);
	}
}
