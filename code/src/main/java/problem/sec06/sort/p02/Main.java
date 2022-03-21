package problem.sec06.sort.p02;

import java.util.Scanner;

// my solution
// bubble sort
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n, int[] arr) {
		while (n-- > 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] > arr[i + 1])
					swap(arr, i, i + 1);
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
