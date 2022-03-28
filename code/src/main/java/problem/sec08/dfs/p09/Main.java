package problem.sec08.dfs.p09;

import java.util.Scanner;

public class Main {
	static int[] combi;
	static int n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		dfs(0, 1);
	}

	private static void dfs(int L, int s) {
		if (L == m) {
			for (int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				dfs(L + 1, i + 1);
			}
		}
	}
}
