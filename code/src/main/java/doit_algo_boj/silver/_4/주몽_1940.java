package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		Arrays.sort(arr);
		int cnt = 0;
		int left = 0;
		int right = 1;
		while (left < right && right != N) {
			int sum = arr[left] + arr[right];
			if (sum == M) {
				cnt++;
				left++;
				right = left + 1;
			}
			else if (sum < M) {
				right++;
				if (right == N) {
					left++;
					right = left + 1;
				}
			} else {
				left++;
				right = left + 1;
			}
		}
		System.out.println(cnt);
	}
}
