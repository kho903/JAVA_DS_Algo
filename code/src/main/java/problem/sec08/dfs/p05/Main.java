package problem.sec08.dfs.p05;

import java.util.Arrays;
import java.util.Scanner;

// time limit -> 거꾸로 돌리는 것이 더 빠른 방법
public class Main {
	static int n, m;
	static int[] arr;
	static int answer = Integer.MAX_VALUE;
	static int c;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		m = sc.nextInt();
		c = m / arr[0];
		dfs(0, 0, 0);
		System.out.println(answer);
	}

	private static void dfs(int L, int cnt, int sum) {
		if (cnt > c || (L > c) || sum > m) return;
		if (sum == m) {
			answer = Math.min(answer, cnt);
			return;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (L++ < c) {
					dfs(L + 1, cnt + 1, sum + arr[i]);
					dfs(L + 1, cnt, sum);
				}
			}
		}
	}
}
