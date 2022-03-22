package problem.sec06.searching.p08;

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
		System.out.println(solution(n, m, arr) + 1);
	}

	private static int solution(int n, int m, int[] arr) {
		Arrays.sort(arr);
		int start = 0;
		int end = n - 1;
		int mid = (end + start) / 2;
		while (true) {
			if (arr[mid] == m) return mid;
			else if (arr[mid] < m) start = mid + 1;
			else end = mid - 1;
			mid = (end + start) / 2;
		}
	}
}
