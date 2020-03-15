package life.codecook.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 11:53
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashTable = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (hashTable.containsKey(complement)) {
				return new int[]{i, hashTable.get(complement)};
			}

			hashTable.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two num solution");
	}
}
