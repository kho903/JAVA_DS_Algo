package problem.sec10.dp.p03;

import java.util.Scanner;

public class Main {
	static int n, max = 0;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			max = Integer.max(max, a);
		}
		dp = new int[max + 1];
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		int answer = 0;
		dp[arr[0]] = 1;

		for (int i = 1; i < n; i++) {
			int cur = 0;
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[i]) {
					cur = Math.max(dp[arr[j]], cur);
				}
			}
			dp[arr[i]] = cur + 1;
		}
		for (int x : dp) {
			answer = Math.max(answer, x);
		}

		return answer;
	}
}
