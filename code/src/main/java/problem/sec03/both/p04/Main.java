package problem.sec03.both.p04;

import java.util.Scanner;

public class Main {
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
		int sumValue = 0, answer = 0, p1 = 0;
		for (int p2 = 0; p2 < n; p2++) {
			sumValue += arr[p2];
			if (sumValue == m) answer++;
			while (sumValue >= m) {
				sumValue -= arr[p1++];
				if (sumValue == m) {
					answer++;
				}
			}
		}
		return answer;
	}
}
