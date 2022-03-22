package problem.sec07.recursive.p03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(dfs(n));
	}

	private static int dfs(int n) {
		if (n == 1) return 1;
		else return n * dfs(n - 1);
	}
}
