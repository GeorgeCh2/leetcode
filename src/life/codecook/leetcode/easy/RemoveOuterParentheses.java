package life.codecook.leetcode.easy;

/**
 * 删除最外层的括号
 *
 * @author georgechmr@gmail.com
 * @date 2020-04-21 22:31
 */
public class RemoveOuterParentheses {
	public static String removeOuterParentheses(String S) {
		int heseCount = 0;

		StringBuilder res = new StringBuilder();

		for (char c : S.toCharArray()) {
			if (c == ')') {
				heseCount--;
			}

			if (heseCount >= 1) {
				res.append(c);
			}

			if (c == '(') {
				heseCount++;
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {
		String s = removeOuterParentheses("(()())(())(()(()))");
	}
}
