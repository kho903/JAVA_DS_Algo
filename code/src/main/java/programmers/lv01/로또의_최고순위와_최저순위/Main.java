package programmers.lv01.로또의_최고순위와_최저순위;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] lottos = new int[] {44, 1, 0, 0, 31, 25};
		int[] win_nums = new int[] {31, 10, 45, 1, 6, 19};
		System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));;

		lottos = new int[] {0, 0, 0, 0, 0, 0};
		win_nums = new int[] {38, 19, 20, 40, 15, 25};
		System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));;

		lottos = new int[] {45, 4, 35, 20, 3, 9};
		win_nums = new int[] {20, 9, 3, 45, 4, 35};
		System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));;
	}
}

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int zero = 0;
		int win = 0;

		for (int lotto : lottos) {
			if (lotto == 0) zero++;
			else {
				for (int w : win_nums) {
					if (lotto == w) win++;
				}
			}
		}
		int minRank = Math.min(7 - (win + zero), 6);
		int maxRank = Math.min(7 - win, 6);

		return new int[] {minRank, maxRank};
	}
}