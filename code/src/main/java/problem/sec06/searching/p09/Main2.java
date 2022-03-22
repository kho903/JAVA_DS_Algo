package problem.sec06.searching.p09;

import java.util.Arrays;
import java.util.Scanner;

// lecture
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else lt = mid + 1;
		}
		return answer;
	}

	public static int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		for (int x : arr) {
			if (sum + x > capacity){
				sum = x;
				cnt++;
			} else sum += x;
		}
		return cnt;
	}
}
