package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_5_11660 {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		arr = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			stk = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				int n = Integer.parseInt(stk.nextToken());
				arr[i][j] = n + arr[i][j - 1] + arr[i - 1][j] - arr[i - 1][j - 1];
			}
		}

		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stk.nextToken());
			int y1 = Integer.parseInt(stk.nextToken());
			int x2 = Integer.parseInt(stk.nextToken());
			int y2 = Integer.parseInt(stk.nextToken());

			System.out.println(arr[x2][y2] - arr[x1 - 1][y2] - arr[x2][y1 - 1] + arr[x1 - 1][y1 - 1]);
		}
	}
}
