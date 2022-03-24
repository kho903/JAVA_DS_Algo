package problem.sec08.dfs.p02;

import java.util.Scanner;

public class Main {
	static int c, n;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		dfs(0, 0, arr);
		System.out.println(max);
	}

	private static void dfs(int L, int sum, int[] arr) {
		if (sum <= c) max = Math.max(max, sum);
		else return;

		if (L == n) {
			return;
		} else {
			dfs(L + 1, sum + arr[L], arr);
			dfs(L + 1, sum, arr);
		}
	}
}
