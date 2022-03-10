package problem.sec02array.p03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		// solution(n, a, b);

		for (char x : solution2(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}

	private static void solution(int n, int[] a, int[] b) {
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				System.out.println("D");
			} else if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1)) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}
	}

	public static String solution2(int n, int[] a, int[] b) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) answer.append("D");
			else if (a[i] == 1 && b[i] == 3) answer.append("A");
			else if (a[i] == 2 && b[i] == 1) answer.append("A");
			else if (a[i] == 3 && b[i] == 2) answer.append("A");
			else answer.append("B");
		}
		return answer.toString();
	}
}
