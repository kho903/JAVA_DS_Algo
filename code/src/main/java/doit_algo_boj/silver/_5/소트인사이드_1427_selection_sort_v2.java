package doit_algo_boj.silver._5;

import java.util.Scanner;

// selection sort
public class 소트인사이드_1427_selection_sort_v2 {
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
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}
			if (arr[i] < arr[max]) {
				int tmp = arr[i];
				arr[i] = arr[max];
				arr[max] = tmp;
			}
		}
	}
}
