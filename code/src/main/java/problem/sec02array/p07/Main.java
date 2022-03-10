package problem.sec02array.p07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, arr));
	}

	public static int solution(int n, int[] arr) {
		int answer = 0, count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) count = 0;
			else answer += ++count;
		}
		return answer;
	}
}
