package programmers.lv01.최소직사각형;

public class Solution {
	public static void main(String[] args) {
		int[][] sizes = {
			{60, 50},
			{30, 70},
			{60, 30},
			{80, 40}
		};
		System.out.println(solution(sizes));
		sizes = new int[][] {
			{10, 7},
			{12, 3},
			{8, 15},
			{14, 7},
			{5, 15}
		};
		System.out.println(solution(sizes));

		sizes = new int[][] {
			{14, 4},
			{19, 6},
			{6, 16},
			{18, 7},
			{7, 11}
		};
		System.out.println(solution(sizes));

	}

	public static int solution(int[][] sizes) {
		int w = 0;
		int h = 0;

		for (int[] size : sizes) {
			w = Math.max(w, Math.max(size[0], size[1]));
			h = Math.max(h, Math.min(size[0], size[1]));
		}

		return w * h;
	}
}
