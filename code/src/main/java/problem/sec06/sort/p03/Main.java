package problem.sec06.sort.p03;

import java.util.Scanner;

// my solution (삽입정렬 잘못 이해) -> solution2로 고침
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int x : solution2(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			// int tmp = arr[i];
			// int idx = -1;
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
		return arr;
	}

	private static int[] solution2(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > tmp) arr[j + 1] = arr[j];
				else break;
			}
			arr[j + 1] = tmp;
		}
		return arr;
	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
