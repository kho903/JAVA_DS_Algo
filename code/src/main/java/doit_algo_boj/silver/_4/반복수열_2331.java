package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 반복수열_2331 {
	static int[] check = new int[236197];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(stk.nextToken());
		int p = Integer.parseInt(stk.nextToken());


		System.out.println(solution(a, p));
	}

	private static int solution(int a, int p) {
		int ans = 0;

		check[a] = 1;
		while (true) {
			int cur = 0;
			while (a > 0) {
				cur += Math.pow((a % 10), p);
				a /= 10;
			}
			check[cur]++;
			if (check[cur] == 3)
				break;
			a = cur;
		}
		for (int i = 1; i < check.length; i++) {
			if (check[i] == 1) ans++;
		}
		return ans;
	}
}
