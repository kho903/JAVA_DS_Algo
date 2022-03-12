package problem.sec02array.p10;

import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n + 2][n + 2];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n+ 1; j++) {
				if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
					arr[i][j] = 0;
				else
					arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n + 2, arr));
	}

	private static int solution(int n, int[][] arr) {
		int answer = 0;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int cur = arr[i][j];
				if (cur > arr[i - 1][j] && cur > arr[i + 1][j] && cur > arr[i][j - 1] && cur > arr[i][j + 1]) {
					answer++;
				}
			}
		}
		return answer;
	}
}
