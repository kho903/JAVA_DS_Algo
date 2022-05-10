package doit_algo_boj.silver._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이친수_2193 {
	static int N;
	static long[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new long[N + 1][2];
		arr[1][0] = 0;
		arr[1][1] = 1;
		for (int i = 2; i <= N; i++) {
			arr[i][0] = arr[i - 1][0] + arr[i - 1][1];
			arr[i][1] = arr[i - 1][0];
		}

		System.out.println(arr[N][0] + arr[N][1]);
	}
}
