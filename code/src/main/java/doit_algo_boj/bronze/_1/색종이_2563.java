package doit_algo_boj.bronze._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_2563 {

	static int[][] arr;

	public static void main(String[] args) throws IOException {
		arr = new int[101][101];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			stk	= new StringTokenizer(br.readLine());
			int x = Integer.parseInt(stk.nextToken());
			int y = Integer.parseInt(stk.nextToken());

			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					if (arr[i][j] == 0) {
						arr[i][j] = 1;
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}
