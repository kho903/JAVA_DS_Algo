package problem.sec06.searching.p09;

import java.util.Arrays;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int start = Arrays.stream(arr).max().getAsInt();
		int end = Arrays.stream(arr).sum();
		int ans = Integer.MAX_VALUE;
		while (start <= end) {
			int mid = (start + end) / 2;
			int cnt = 1;
			int cur = 0;
			for (int i = 0; i < n; i++) {
				cur += arr[i];
				if (cur > mid) {
					cur = arr[i];
					cnt++;
				}
			}
			if (cnt > m) break;
			else if (ans > mid) ans = mid;
			end -= 1;
		}
		return ans;
	}

}
