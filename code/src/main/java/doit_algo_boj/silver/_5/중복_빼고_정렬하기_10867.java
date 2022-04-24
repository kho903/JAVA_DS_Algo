package doit_algo_boj.silver._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복_빼고_정렬하기_10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		boolean[] plus = new boolean[1001];
		boolean[] minus = new boolean[1001];

		String[] s = br.readLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			int x = Integer.parseInt(s[i]);
			if (x >= 0) plus[x] = true;
			else minus[-x] = true;
		}

		for (int i = 1000; i > 0; i--) {
			if (minus[i]) sb.append(-i).append(" ");
		}

		for (int i = 0; i < 1001; i++) {
			if (plus[i]) sb.append(i).append(" ");
		}

		System.out.println(sb);
	}
}
