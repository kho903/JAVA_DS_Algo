package programmers.lv01.예산;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(solution(new int[] {2,2,3,3,}, 10));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int w : d) {
			if (w <= budget) {
				answer++;
				budget -= w;
			}
		}
		return answer;
	}
}
