package life.codecook.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 按既定顺序创建目标数组
 *
 * @author zhouzhi@qbb6.com
 * @date 2020-04-19 15:44
 */
public class CreateTargetArray {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> target = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			target.add(index[i], nums[i]);
		}

		int[] targetArray = new int[target.size()];
		for (int i = 0; i < target.size(); i++) {
			targetArray[i] = target.get(i);
		}

		return targetArray;
	}


}
