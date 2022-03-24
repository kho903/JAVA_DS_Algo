package problem.sec08.dfs.p03;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] pr = new int[n][2];
		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			int time = sc.nextInt();
			pr[i][0] = score;
			pr[i][1] = time;
		}
		dfs(0, 0, 0, pr);
		System.out.println(max);
	}

	private static void dfs(int L, int curScore, int t, int[][] pr) {

		if (t > m) return;
		if (L == n)
			max = Math.max(max, curScore);
		else {
			max = Math.max(max, curScore);
			dfs(L + 1, curScore + pr[L][0], t + pr[L][1], pr);
			dfs(L + 1, curScore, t, pr);
		}
	}

}
