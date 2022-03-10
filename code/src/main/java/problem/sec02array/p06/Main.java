package problem.sec02array.p06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		for (int ans : solution(n, s)) {
			System.out.print(ans + " ");
		}
	}

	public static List<Integer> solution(int n, int[] s) {
		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int reverse = reverseValue(s[i]);
			if (isPrime(reverse))
				answer.add(reverse);
		}
		return answer;
	}

	public static int reverseValue(int num) {
		int value = 0;
		while (num != 0) {
			value = 10 * value + num %10;
			num /= 10;
		}
		return value;
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		int[] ch = new int[num + 1];
		for (int i = 2; i < num; i++) {
			if (ch[i] == 0) {
				for (int j = i; j <= num; j = j + i) ch[j] = 1;
			}
		}
		return ch[num] == 0;
	}
}
