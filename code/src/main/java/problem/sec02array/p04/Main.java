package problem.sec02array.p04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.stream(solution(n)).forEach(i -> System.out.print(i + " "));
		solution2(n);
	}

	private static int[] solution(int n) {
		int[] res = new int[n];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i < n; i++) {
			res[i] = res[i - 1] + res[i - 2];
		}
		return res;
	}

	public static void solution2(int n) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
