package doit_algo_boj.silver._5;

import java.util.Scanner;

// selection sort
public class 소트인사이드_1427_selection_sort {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		arr = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			arr[i] = ch[i] - '0';
		}

		solution();
		StringBuilder sb = new StringBuilder();
		for (int x : arr) {
			sb.append(x);
		}
		System.out.println(sb);
	}

	private static void solution() {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int maxIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = max;
			arr[maxIndex] = tmp;
		}
	}
}
