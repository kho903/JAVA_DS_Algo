package doit_algo_boj.silver._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_4_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		long[] sum = new long[N + 1];

		stk = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			sum[i] = sum[i - 1] + Long.parseLong(stk.nextToken());
		}

		for (int q = 0; q < M; q++) {
			stk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stk.nextToken());
			int j = Integer.parseInt(stk.nextToken());
			System.out.println(sum[j] - sum[i - 1]);
		}

	}
}
