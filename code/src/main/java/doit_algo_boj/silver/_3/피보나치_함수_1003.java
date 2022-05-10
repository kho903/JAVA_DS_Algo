package doit_algo_boj.silver._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_함수_1003 {

	static int zero = 1;
	static int one = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			fibo(Integer.parseInt(br.readLine()));
			sb.append(zero).append(" ").append(one).append("\n");
			zero = 1;
			one = 0;
		}
		System.out.println(sb);
	}

	private static void fibo(int n) {
		int temp = 1;
		for (int i = 0; i < n; i++) {
			zero = one;
			one = temp;
			temp = zero + one;
		}
	}
}
