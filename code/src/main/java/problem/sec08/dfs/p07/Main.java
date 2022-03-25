package problem.sec08.dfs.p07;

import java.util.Scanner;

public class Main {
	static int n, r, answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		solution(n, r);
		System.out.println(answer);
	}

	private static void solution(int n, int r) {
		if (n == r || n == 0 || r == 0) {
			answer++;
			return;
		}
		solution(n - 1, r - 1);
		solution(n - 1, r);
	}
}
