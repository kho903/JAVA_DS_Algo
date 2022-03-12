package problem.sec02array.p11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n, arr));
	}

	public static int solution(int n, int[][] arr) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			List<Integer> count = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if (i != j && !count.contains(j) && arr[i][k] == arr[j][k]) {
						count.add(j);
					}
				}
			}
			answer[i] = count.size();
		}
		int maxIndex = 0;
		for (int i = 0; i < n; i++) {
			maxIndex = answer[i] > answer[maxIndex] ? i : maxIndex;
		}
		return maxIndex + 1;
	}
}
