package problem.sec10.dp.p01;

import java.util.Scanner;

public class Main {
	static int[] dp;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if (i < 3) dp[i] = i;
			else dp[i] = dp[i - 2] + dp[i - 1];
		}
		System.out.println(dp[n]);
	}
}
