package problem.sec08.dfs.p04;

import java.util.Scanner;

// after lecture
public class Main3 {
	static int n, m;
	static int[] answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		answer = new int[m];
		dfs(0);
	}

	private static void dfs(int L) {
		if (L == m) {
			for (int x : answer) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				answer[L] = i;
				dfs(L + 1);
			}
		}
	}
}
