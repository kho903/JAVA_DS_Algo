package problem.sec06.sort.p01;

import java.util.Scanner;

// my solution
// selection sort
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
		for (int i = 0; i < n; i++) {
			int minValue = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		return arr;
	}

	public static void swap(int[] arr, int aIndex, int bIndex) {
		int tmp = arr[aIndex];
		arr[aIndex] = arr[bIndex];
		arr[bIndex] = tmp;
	}
}
