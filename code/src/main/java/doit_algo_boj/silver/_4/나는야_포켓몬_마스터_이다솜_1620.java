package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 나는야_포켓몬_마스터_이다솜_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());

		HashMap<String, String> map = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String monster = br.readLine();
			String num = Integer.toString(i);
			map.put(monster, num);
			map.put(num, monster);
		}

		while (M-- > 0) {
			String input = br.readLine();
			sb.append(map.get(input)).append("\n");
		}
		System.out.println(sb);
	}
}
