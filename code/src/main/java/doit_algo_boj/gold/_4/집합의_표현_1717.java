package doit_algo_boj.gold._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 집합의_표현_1717 {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());

		arr = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());

			int q = Integer.parseInt(stk.nextToken());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());

			if (q == 0) {
				union(a, b);
			} else {
				if (isSame(a, b)) sb.append("YES\n");
				else sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}

	private static boolean isSame(int a, int b) {
		return find(a) == find(b);
	}

	private static int find(int x) {
		if (x == arr[x]) return x;
		else return arr[x] = find(arr[x]);
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b) arr[b] = a;
	}
}
