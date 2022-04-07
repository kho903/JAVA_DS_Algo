package doit_algo_boj.silver._3;

import java.io.IOException;
import java.util.Scanner;

// insertion sort
public class ATM_11399 {
	static int N;
	static int[] arr;
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort();
		int[] sumArr = makeSumArray();
		int ans = 0;
		for (int x : sumArr) {
			ans += x;
		}
		System.out.println(ans);
	}

	private static int[] makeSumArray() {
		int[] res = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				res[i] += arr[j];
			}
		}
		return res;
	}

	private static void insertionSort() {
		for (int i = 1; i < N; i++) {
			int cur = arr[i];
			int insertionIndex = i;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < cur) {
					insertionIndex = j + 1;
					break;
				}
				if (j == 0) insertionIndex =0;
			}
			for (int j = i; j > insertionIndex; j--) {
				arr[j] = arr[j - 1];
			}
			arr[insertionIndex] = cur;

		}
	}
}
