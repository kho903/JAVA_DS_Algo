package problem.sec02array.p09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution2(n, arr));
	}

	// my solution
	private static int solution(int n, int[][] arr) {
		int row = 0;
		int col = 0;
		for (int i = 0; i < n; i++) {
			int rowCur = 0;
			int colCur = 0;
			for (int j = 0; j < n; j++) {
				rowCur += arr[i][j];
				colCur += arr[j][i];
			}
			row = Math.max(row, rowCur);
			col = Math.max(col, colCur);
		}

		int startLeft = 0;
		int startRight = 0;

		for (int i = 0; i < n; i++) {
			startLeft += arr[i][i];
			startRight += arr[i][n - i - 1];
		}
		int diagonal = Math.max(startRight, startLeft);
		return Math.max(Math.max(row, col), diagonal);
	}

	// lecture
	public static int solution2(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(Math.max(answer, sum1), sum2);
		}
		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}
		answer = Math.max(Math.max(answer, sum1), sum2);
		return answer;
	}
}
