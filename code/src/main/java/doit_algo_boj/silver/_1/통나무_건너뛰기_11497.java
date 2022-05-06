package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 통나무_건너뛰기_11497 {
	static int[] arr;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			N = Integer.parseInt(br.readLine());
			stk = new StringTokenizer(br.readLine());
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(stk.nextToken());;
			}
			sb.append(solution()).append("\n");
		}
		System.out.println(sb);
	}

	private static int solution() {
		Arrays.sort(arr);
		int[] sorted = sort();
		int max = Math.abs(sorted[0] - sorted[N - 1]);

		for (int i = 0; i < sorted.length - 1; i++) {
			max = Math.max(max, Math.abs(sorted[i] - sorted[i + 1]));
		}
		return max;
	}

	private static int[] sort() {
		int[] res = new int[N];
		int l = 0;
		int r = N - 1;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0)
				res[l++] = arr[i];
			else
				res[r--] = arr[i];
		}
		return res;
	}

}
