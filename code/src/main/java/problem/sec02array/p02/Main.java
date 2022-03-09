package problem.sec02array.p02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution2(n, arr));
	}

	// my solution
	private static int solution(int n, int[] arr) {
		int cur = arr[0];
		int count = 1;
		for (int stu : arr) {
			if (cur < stu) {
				count++;
				cur = stu;
			}
		}
		return count;
	}

	// lecture
	public static int solution2(int n, int[] arr) {
		int answer = 1, max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max	= arr[i];
			}
		}
		return answer;
	}
}
