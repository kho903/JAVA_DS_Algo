package problem.sec04_hash.p05;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, arr));
	}

	private static int solution(int n, int k, int[] arr) {
		TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}

		int cnt = 0;
		for (int x : set) {
			cnt++;
			if (cnt == k) return x;
		}
		return -1;
	}
}