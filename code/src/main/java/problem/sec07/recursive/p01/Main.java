package problem.sec07.recursive.p01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dfs(n);
	}

	private static void dfs(int n) {
		if (n == 0) return;
		dfs(n - 1);
		System.out.print(n + " ");
	}
}
