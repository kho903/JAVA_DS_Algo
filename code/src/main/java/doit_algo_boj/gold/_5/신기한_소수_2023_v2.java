package doit_algo_boj.gold._5;

import java.util.Scanner;

// book solution
public class 신기한_소수_2023_v2 {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		dfs(2, 1);
		dfs(3, 1);
		dfs(5, 1);
		dfs(7, 1);
	}

	private static void dfs(int number, int jarisu) {
		if (jarisu == N) {
			if (isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) continue;
			if (isPrime(number * 10 + i))
				dfs(number * 10 + i, jarisu + 1);
		}
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
}
