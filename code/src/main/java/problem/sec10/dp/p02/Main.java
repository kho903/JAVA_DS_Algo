package problem.sec10.dp.p02;

import java.util.Scanner;

public class Main {
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n + 1];
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		dp[1] = 2;
		dp[2] = 3;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}
		return dp[n];
	}
}
