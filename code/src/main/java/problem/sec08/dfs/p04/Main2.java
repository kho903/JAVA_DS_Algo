package problem.sec08.dfs.p04;

import java.util.Scanner;

// lecture - dfs
public class Main2 {
	static int[] pm;
	static int n, m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		dfs(0);
	}

	private static void dfs(int L) {
		if (L == m) {
			for (int x : pm)
				System.out.print(x + " ");
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				dfs(L + 1);
			}
		}
	}
}
