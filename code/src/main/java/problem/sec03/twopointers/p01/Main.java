package problem.sec03.twopointers.p01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int x : solution2(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n, int m, int[] arr1, int[] arr2) {
		int[] ans = new int[n + m];
		// two pointer
		int n1 = 0, m1 = 0;
		for (int i = 0; i < n + m; i++) {
			if (n1 < n && arr1[n1] <= arr2[m1]) {
				ans[i] = arr1[n1++];
			} else {
				ans[i] = arr2[m1++];
			}
		}
		return ans;
	}

	// after lecture
	public static List<Integer> solution2(int n, int m, int[] arr1, int[] arr2) {
		List<Integer> answer = new ArrayList<>();
		int n1 = 0, m1 = 0;
		while (n1 < n && m1 < m) {
			if (arr1[n1] < arr2[m1]) answer.add(arr1[n1++]);
			else answer.add(arr2[m1++]);
		}
		while (n1 < n) answer.add(arr1[n1++]);
		while (m1 < m) answer.add(arr2[m1++]);
		return answer;
	}
}
