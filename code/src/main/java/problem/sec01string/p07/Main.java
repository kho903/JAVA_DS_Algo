package problem.sec01string.p07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution2(str));
	}

	// my solution
	private static String solution(String str) {
		str = str.toUpperCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return "NO";
			}
		}
		return "YES";
	}

	// lecture
	private static String solution2(String str) {
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp)) return "YES";
		else return "NO";
	}
}
