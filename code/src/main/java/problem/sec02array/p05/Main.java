package problem.sec02array.p05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution2(n));
	}

	// my solution -> solution2 가 더 적절, 간결
	private static int solution(int n) {
		int[] arr = new int[n + 1];
		for (int i = 2; i < n + 1; i++) {
			if (arr[i] == 0) {
				int a = 2;
				while (i * a < n + 1) {
					arr[i * a] = 1;
					a++;
				}
			}
		}
		int cnt = 0;
		for (int i = 2; i < n + 1; i++) {
			if (arr[i] == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	// lecture
	public static int solution2(int n) {
		int answer = 0;
		int[] ch = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (ch[i] == 0) {
				answer++;
				for (int j = i; j <= n; j = j + i) ch[j] = 1;
			}
		}
		return answer;
	}
}
