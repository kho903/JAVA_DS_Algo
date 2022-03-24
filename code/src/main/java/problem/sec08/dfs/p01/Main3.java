package problem.sec08.dfs.p01;

import java.util.Scanner;

// my solution after lecture
public class Main3 {
	static int n, total = 0;
	static boolean flag = false;
	static String answer = "NO";

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
		if (sum > total - sum) return;
		if (L == n) {
			if (total - sum == sum) {
				flag = true;
				answer = "YES";
			}
		}
		else {
			dfs(L + 1, sum + arr[L], arr);
			dfs(L + 1, sum, arr);
		}
	}
}
