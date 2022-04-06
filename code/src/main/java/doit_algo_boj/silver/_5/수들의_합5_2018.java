package doit_algo_boj.silver._5;

import java.util.Scanner;

public class 수들의_합5_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(solution(N));
	}

	private static int solution(int n) {
		int cnt = 1;
		int left = 1;
		int right = 1;
		int sum = 1;
		while (right < n) {
			if (sum < n) {
				right++;
				sum += right;
			} else {
				if (sum == n) cnt++;
				sum -= left;
				left++;
			}
		}
		return cnt;
	}
}
