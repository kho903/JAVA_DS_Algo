package doit_algo_boj.silver._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자_정사각형_1051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++)
				arr[i][j] = s.charAt(j) - '0';
		}

		int ans = 0;
		int max_len = Math.min(m, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int cur = arr[i][j];
				for (int k = 0; k < max_len; k++) {
					if (i + k >= n || j + k >= m) continue;
					if (arr[i + k][j] == cur && arr[i + k][j + k] == cur && arr[i][j + k] == cur) {
						ans = Math.max(ans, (k + 1) * (k + 1));
					}
				}
			}
		}
		System.out.println(ans);
	}
}
