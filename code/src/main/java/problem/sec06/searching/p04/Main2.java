package problem.sec06.searching.p04;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (Integer x : solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for (int x : arr) {
			int pos = -1;
			for (int i = 0; i < s; i++) if (x == cache[i]) pos = i;

			if (pos == -1) {
				for (int i = s - 1; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
			} else {
				for (int i = pos; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
}
