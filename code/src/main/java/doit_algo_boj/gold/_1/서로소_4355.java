package doit_algo_boj.gold._1;

import java.util.Scanner;

public class 서로소_4355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			solution(n);
		}
	}

	private static void solution(int n) {
		int cnt = n;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				cnt -= cnt / i;
				while (n % i == 0) n /= i;
			}
		}

		if (n > 1) cnt -= cnt / n;
		System.out.println(cnt);
	}
}
