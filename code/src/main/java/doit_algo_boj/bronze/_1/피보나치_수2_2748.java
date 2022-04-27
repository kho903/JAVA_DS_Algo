package doit_algo_boj.bronze._1;

import java.util.Scanner;

public class 피보나치_수2_2748 {
	static Long[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new Long[n + 1];
		arr[0] = 0L;
		arr[1] = 1L;

		System.out.println(fibo(n));
	}

	private static long fibo(int n) {
		if (arr[n] == null) {
			arr[n] = fibo(n - 1) + fibo(n - 2);
		}
		return arr[n];
	}
}
