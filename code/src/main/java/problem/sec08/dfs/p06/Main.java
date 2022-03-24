package problem.sec08.dfs.p06;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] answer, arr, checked;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		answer = new int[m];
		arr = new int[n];
		checked = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		dfs(0);
	}

	private static void dfs(int x) {
		if (x == m) {
			for (int a : answer)
				System.out.print(a + " ");
			System.out.println();
		}
		else {
			for (int i = 0; i < n; i++) {
				if (checked[i] == 0) {
					checked[i] = 1;
					answer[x] = arr[i];
					dfs(x + 1);
					checked[i] = 0;
				}
			}
		}
	}
}
