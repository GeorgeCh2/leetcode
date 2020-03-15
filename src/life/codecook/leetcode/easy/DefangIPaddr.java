package life.codecook.leetcode.easy;

/**
 * IP地址无效化
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 15:42
 */
public class DefangIPaddr {
	public static String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

	public static void main(String[] args) {
		defangIPaddr("1.1.1.1");
	}
}
