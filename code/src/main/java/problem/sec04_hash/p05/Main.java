package problem.sec04_hash.p05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
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
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int m = j + 1; m < n; m++) {
					ts.add(arr[i] + arr[j] + arr[m]);
				}
			}
		}
		if (ts.size() < k) {
			return -1;
		}
		List<Integer> res = new ArrayList<>(ts);
		return res.get(k - 1);

	}
}
