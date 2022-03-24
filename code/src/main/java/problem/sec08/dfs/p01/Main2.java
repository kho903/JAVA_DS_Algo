package problem.sec08.dfs.p01;

import java.util.Scanner;

public class Main2 {
	static String answer = "NO";
	static int n, total = 0;
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		dfs(0, 0, arr);
		System.out.println(answer);
	}

	private static void dfs(int L, int sum, int[] arr) {
		if (flag) return;
		if (sum > total / 2) return;
		if (L == n) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			dfs(L + 1, sum + arr[L], arr);
			dfs(L + 1, sum, arr);
		}
	}
}
