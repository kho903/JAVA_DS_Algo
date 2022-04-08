package doit_algo_boj.silver._2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실_배정_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) return o1[0] - o2[0];
				return o1[1] - o2[1];
			}
		});

		int cnt = 0;
		int end = -1;
		for (int[] a : arr) {
			if (a[0] >= end) {
				cnt++;
				end = a[1];
			}
		}
		System.out.println(cnt);
	}
}
