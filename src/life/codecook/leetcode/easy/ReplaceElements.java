package life.codecook.leetcode.easy;


/**
 * 将每个元素替换为右侧最大元素
 *
 * @author georgechmr@gmail.com
 * @date 2020-04-26 21:14
 */
public class ReplaceElements {
	public static int[] replaceElements(int[] arr) {
		int[] res = new int[arr.length];
		res[arr.length - 1] = -1;

		for (int i = arr.length - 2; i >= 0; i--) {
			res[i] = res[i+1];
			if (arr[i+1] > res[i+1]) {
				res[i] = arr[i+1];
			}
		}
		return res;
	}


	public static void main(String[] args) {
		replaceElements(new int[] {17,18,5,4,6,1});
	}
}
