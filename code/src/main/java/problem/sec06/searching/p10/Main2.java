package problem.sec06.searching.p10;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
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

	private static int solution(int n, int c, int[] arr) {
		Arrays.sort(arr);
		int answer = 0;
		int lt = 1;
		int rt = arr[n - 1];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (calc(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else rt = mid - 1;
		}
		return answer;
	}

	private static int calc(int[] arr, int mid) {
		int cnt = 1;
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
}
