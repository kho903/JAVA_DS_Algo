package programmers.lv01.실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
		System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		int[] count = new int[N + 2];
		for (int stage : stages) {
			count[stage]++;
		}
		int remain = stages.length;
		ArrayList<Stage> arr = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			double fail;
			if (remain == 0) fail = 0;
			else fail = ( double) count[i] / remain;
			remain -= count[i];
			arr.add(new Stage(i, fail));
		}

		Collections.sort(arr);
		int i = 0;
		for (Stage stage : arr) {
			answer[i++] = stage.idx;
		}

		return answer;
	}

	static class Stage implements Comparable<Stage> {
		int idx;
		double failure;

		public Stage(int idx, double failure) {
			this.idx = idx;
			this.failure = failure;
		}

		@Override
		public int compareTo(Stage o) {
			if (this.failure == o.failure) return this.idx - o.idx;
			else if (o.failure > this.failure) return 1;
			else return -1;
		}

	}

}