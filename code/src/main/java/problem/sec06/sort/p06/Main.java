package problem.sec06.sort.p06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// my solution
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

	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		for (int i = 0; i < n; i++) {
			if (sortedArr[i] != arr[i]) answer.add(i + 1);
		}
		return answer;
	}
}
