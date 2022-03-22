package problem.sec06.sort.p07;

import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for (int[] x : solution(n, arr)) {
			System.out.println(x[0] + " " + x[1]);
		}
	}

	private static int[][] solution(int n, int[][] arr) {
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if ((arr[minIndex][0] > arr[j][0]) ||
					(arr[minIndex][0] == arr[j][0] && arr[minIndex][1] > arr[j][1])) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		return arr;
	}

	public static void swap(int[][] arr, int i, int j) {
		int[] tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
