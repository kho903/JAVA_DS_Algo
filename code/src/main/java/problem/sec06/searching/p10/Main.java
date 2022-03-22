package problem.sec06.searching.p10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] xi = new int[n];
		for (int i = 0; i < n; i++) {
			xi[i] = sc.nextInt();
		}

		System.out.println(solution(n, c, xi));
	}

	private static int solution(int n, int c, int[] xi) {
		Arrays.sort(xi);
		int answer = 0;
		int start = 1;
		int end = xi[n - 1];
		while (start <= end) {
			int mid = (end + start) / 2;
			if (count(xi, mid) >= c) {
				answer = mid;
				start = mid + 1;
			} else end = mid - 1;
		}
		return answer;
	}

	private static int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}

}
