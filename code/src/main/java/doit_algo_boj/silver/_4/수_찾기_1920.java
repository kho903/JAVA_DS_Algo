package doit_algo_boj.silver._4;

import java.util.Arrays;
import java.util.Scanner;

public class 수_찾기_1920 {
	static int N;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int target = sc.nextInt();
			System.out.println(binarySearch(target) ? 1 : 0);
		}
	}

	private static boolean binarySearch(int target) {
		int start = 0;
		int end = N - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			int value = arr[mid];
			if (value == target) return true;
			else if (value < target) start = mid + 1;
			else end = mid - 1;
		}
		return false;
	}
}
