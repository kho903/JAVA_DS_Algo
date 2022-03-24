package problem.sec08.dfs.p05;

import java.util.Scanner;

// after lecture
public class Main3 {
	static int n, m, answer = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		m = sc.nextInt();
		dfs(0, 0, arr);
		System.out.println(answer);
	}

	private static void dfs(int L, int sum, int[] arr) {
		if (sum > m) return;
		if (L >= answer) return;
		if (sum == m) {
			answer = Math.min(answer, L);
		} else {
			for (int i = n - 1; i >= 0; i--) {
				dfs(L + 1, sum + arr[i], arr);
			}
		}
	}
}
