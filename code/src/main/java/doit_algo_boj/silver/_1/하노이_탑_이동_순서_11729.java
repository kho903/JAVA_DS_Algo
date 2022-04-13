package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이_탑_이동_순서_11729 {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int cnt = (int) Math.pow(2, n) - 1;
		sb.append(cnt).append("\n");
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
	}

	private static void hanoi(int n, int s, int m, int e) {
		if (n == 1) sb.append(s).append(" ").append(e).append("\n");
		else {
			hanoi(n - 1, s, e, m);
			sb.append(s).append(" ").append(e).append("\n");
			hanoi(n - 1, m, s, e);
		}
	}
}
