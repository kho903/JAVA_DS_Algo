package doit_algo_boj.bronze._1;

import java.util.Scanner;

public class 평균_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			arr[i] = x;
			if (x > max) max = x;
		}
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		System.out.println(sum * 100.0 / (N * max));
	}
}
