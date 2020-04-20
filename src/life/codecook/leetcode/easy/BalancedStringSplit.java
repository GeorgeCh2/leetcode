package life.codecook.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 分割平衡字符串
 *
 * @author zhouzhi@qbb6.com
 * @date 2020-04-20 22:42
 */
public class BalancedStringSplit {
	/**
	 * 贪心算法
	 * @param s
	 * @return
	 */
	private static int balancedStringSplit(String s) {
		int charNum = 0, res = 0;

		for (char ch : s.toCharArray()) {
			if (ch == 'L') {
				charNum++;
			} else {
				charNum--;
			}

			if (charNum == 0) {
				res++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		balancedStringSplit("RLLLLRRRLR");
	}
}
