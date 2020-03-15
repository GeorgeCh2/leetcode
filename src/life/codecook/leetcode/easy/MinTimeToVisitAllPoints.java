package life.codecook.leetcode.easy;

/**
 * 访问所有点的最小时间
 *
 * @author georgechmr@gmail.com
 * @date 2020-03-15 15:53
 */
public class MinTimeToVisitAllPoints {
	public static int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		for (int i = 0; i < points.length - 1; i++) {
			time += Math.max(Math.abs(points[i+1][0] - points[i][0]), Math.abs(points[i+1][1] - points[i][1]));
		}

		return time;
	}

	public static void main(String[] args) {
		int[][] points = new int[][]{{1,1},{3,4},{-1,0}};
		minTimeToVisitAllPoints(points);
	}
}
