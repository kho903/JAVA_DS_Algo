package doit_algo_boj.gold._1;

import java.util.Scanner;

public class GCD_1_11689 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = n;

		for (long i = 2; i <= Math.sqrt(ans); i++) {
			if (n % i == 0) {
				ans -= ans / i;
				while (n % i == 0) n /= i;
			}
		}
		if (n > 1) ans -= ans / n;
		System.out.println(ans);
	}
}
