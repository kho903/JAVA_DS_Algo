package problem.sec03.twopointers.p05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution2(n));
	}

	// my solution
	private static int solution(int n) {
		int sumValue = 0, p2 = 1, answer = 0;
		for (int p1 = 1; p1 <= n / 2 + 1; p1++) {
			sumValue += p1;
			if (sumValue == n) answer++;
			while (sumValue >= n) {
				sumValue -= p2++;
				if (sumValue == n) answer++;
			}
		}
		return answer;
	}

	// lecture
	public static int solution2(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) arr[i] = i + 1;
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if (sum == n) answer++;
			while (sum >= n) {
				sum -= arr[lt++];
				if (sum == n) answer++;
			}
		}
		return answer;
	}
}
