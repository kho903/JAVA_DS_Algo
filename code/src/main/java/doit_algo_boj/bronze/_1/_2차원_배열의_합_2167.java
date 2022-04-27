package doit_algo_boj.bronze._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2차원_배열의_합_2167 {
	static int N, M;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());

		arr = new int[N + 1][M + 1];

		for (int i = 1; i < N + 1; i++) {
			stk = new StringTokenizer(br.readLine());
			for (int j = 1; j < M + 1; j++) {
				arr[i][j] = Integer.parseInt(stk.nextToken());
			}
		}

		int K = Integer.parseInt(br.readLine());
		while (K-- > 0) {
			stk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stk.nextToken());
			int j = Integer.parseInt(stk.nextToken());
			int x = Integer.parseInt(stk.nextToken());
			int y = Integer.parseInt(stk.nextToken());

			sb.append(solution(i, j, x, y)).append("\n");
		}
		System.out.println(sb);
	}

	private static long solution(int i, int j, int x, int y) {
		long ans = 0;
		for (int a = i; a <= x; a++) {
			for (int b = j; b <= y; b++) {
				ans += arr[a][b];
			}
		}
		return ans;
	}
}
