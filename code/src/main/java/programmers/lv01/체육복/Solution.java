package programmers.lv01.체육복;

import java.util.Arrays;

public class Solution {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for (int k : lost) {
			if (k == -1)
				continue;
			for (int j = 0; j < reserve.length; j++) {
				if (k == reserve[j] - 1 || k == reserve[j] + 1) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
		System.out.println(solution(5, new int[] {2, 4}, new int[] {3}));
		System.out.println(solution(3, new int[] {3}, new int[] {1}));
	}
}
