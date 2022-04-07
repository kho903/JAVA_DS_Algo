package doit_algo_boj.bronze._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// bubble sort
public class 수_정렬하기_2750_bubble_sort {
	static int N;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bubbleSort();
		for (int x : arr) {
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}

	private static void bubbleSort() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
