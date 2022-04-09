package doit_algo_boj.silver._3;

import java.util.Scanner;

public class 소수_구하기_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for (int i = 2; i < N + 1; i++) {
			arr[i] = 1;
		}
		for (int j = 2; j <= Math.sqrt(N);j++) {
			if (arr[j] == 0) continue;
			for (int k = j * 2; k <= N; k += j) {
				if (arr[k] == 1) arr[k] = 0;
			}
		}
		for (int i = M; i <= N; i++) {
			if (arr[i] == 1) System.out.println(i);
		}
	}
}
