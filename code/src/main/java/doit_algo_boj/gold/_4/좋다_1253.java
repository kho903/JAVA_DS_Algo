package doit_algo_boj.gold._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좋다_1253 {
	static long[] arr;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new long[N];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(stk.nextToken());
		}
		Arrays.sort(arr);

		System.out.println(solution());
	}

	public static int solution() {
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			long cur = arr[i];
			int left = 0;
			int right = N - 1;

			while (left < right) {
				long sum = arr[left] + arr[right];
				if (sum == cur) {
					if (left != i && right != i) {
						cnt++;
						break;
					}
					else if (left == i) left++;
					else right--;
				} else if (sum < cur) left++;
				else right--;
			}
		}
		return cnt;
	}
}
