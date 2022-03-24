package problem.sec09.p01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tall = new int[n];
		int[] weight = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tall[i] = a;
			weight[i] = b;
		}
		System.out.println(solution(n, tall, weight));
	}

	private static int solution(int n, int[] tall, int[] weight) {
		int cnt = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (tall[i] < tall[j] && weight[i] < weight[j]) {
					cnt -= 1;
					break;
				}
			}
			if (cnt == 0) return 0;
		}
		return cnt;
	}
}
