package problem.sec02array.p08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		int[] answer = solution(n, scores);
		for (int rank : answer) {
			System.out.print(rank + " ");
		}
	}

	private static int[] solution(int n, int[] scores) {
		int[] rankArr = new int[n];

		for (int i = 0; i < n; i++) {
			rankArr[i] = 1;
			for (int j = 0; j < n; j++) {
				if (scores[i] < scores[j]) {
					rankArr[i] += 1;
				}
			}
		}
		return rankArr;
	}
}
