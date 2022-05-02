package doit_algo_boj.silver._5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 점수_계산_2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Score> arr = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			int s = sc.nextInt();
			arr.add(new Score(s, i));
		}

		Collections.sort(arr);

		int[] ans = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr.get(i).s;
			ans[i] = arr.get(i).index;
		}

		System.out.println(sum);

		Arrays.sort(ans);
		for (int i = 0; i < 5; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	static class Score implements Comparable<Score> {
		int s;
		int index;

		public Score(int s, int index) {
			this.s = s;
			this.index = index;
		}

		@Override
		public int compareTo(Score o) {
			return o.s - this.s;
		}
	}
}

