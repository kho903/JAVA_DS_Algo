package doit_algo_boj.silver._4;

import java.util.Scanner;

public class 수열_2491 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = 1;
		int cur = 1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] <= arr[i + 1]) cur++;
			else cur = 1;
			ans = Math.max(ans, cur);
		}

		cur = 1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] >= arr[i + 1]) cur++;
			else cur = 1;
			ans = Math.max(ans, cur);
		}
		System.out.println(ans);
	}
}
