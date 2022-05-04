package doit_algo_boj.silver._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 기상캐스터_10709 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(stk.nextToken());
		int w = Integer.parseInt(stk.nextToken());
		String[][] arr = new String[h][w];
		for (int i = 0; i < h; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				arr[i][j] = s[j];
			}
		}

		for (int i = 0; i < h; i++) {
			boolean flag = false;
			int c = 0;
			for (int j = 0; j < w; j++) {
				if (arr[i][j].equals("c")) {
					c = 0;
					flag = true;
				}

				if (!flag) sb.append(-1).append(" ");
				else sb.append(c++).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
