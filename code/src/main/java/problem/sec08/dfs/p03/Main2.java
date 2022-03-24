package problem.sec08.dfs.p03;

import java.util.Scanner;

public class Main2 {
	static int answer = Integer.MIN_VALUE, n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		dfs(0, 0, 0, a, b);
		System.out.println(answer);
	}

	private static void dfs(int L, int sum, int time, int[] ps, int[] pt) {
		if (time > m) return;
		if (L == n) {
			answer = Math.max(answer , sum);
		} else {
			dfs(L + 1, sum + ps[L], time + pt[L], ps, pt);
			dfs(L + 1, sum, time, ps, pt);
		}
	}
}
