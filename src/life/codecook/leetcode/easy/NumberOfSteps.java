package life.codecook.leetcode.easy;


/**
 * 将数字变成0的操作次数
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 13:49
 */
public class NumberOfSteps {

	public static int numberOfSteps(int num) {
		int temp = num, res = 0;
		while (temp != 0) {
			temp = (temp & 1) == 1 ? num & -2 : num >>1;
			res++;
		}

		return res;
	}

	public static void main(String[] args) {
		numberOfSteps(123);
	}
}
