package problem.sec06.sort.p05;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution2(n, arr));
	}

	private static char solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] == arr[j]) return 'D';
		return 'U';
	}

	private static char solution2(int n, int[] arr) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int x : arr)
			hashSet.add(x);
		if (arr.length != hashSet.size()) return 'D';
		return 'U';
	}
}
