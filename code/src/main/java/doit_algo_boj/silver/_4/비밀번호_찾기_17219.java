package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 비밀번호_찾기_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());

		HashMap<String, String> map = new HashMap<>();

		while (n-- > 0) {
			stk = new StringTokenizer(br.readLine());
			String k = stk.nextToken();
			String v = stk.nextToken();
			map.put(k, v);
		}

		while (m-- > 0) {
			String s = br.readLine();
			sb.append(map.get(s)).append("\n");
		}

		System.out.println(sb);
	}
}
