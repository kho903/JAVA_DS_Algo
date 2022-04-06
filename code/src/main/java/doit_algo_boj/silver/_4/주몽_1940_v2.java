package doit_algo_boj.silver._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940_v2 {
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
		int right = N - 1;
		while (left < right) {
			if (arr[left] + arr[right] < M) {
				left++;
			} else if (arr[left] + arr[right] > M) {
				right--;
			} else {
				cnt++;
				left++;
				right--;
			}
		}
		System.out.println(cnt);
	}
}
