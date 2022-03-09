package problem.sec01string.p02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
			else sb.append(Character.toUpperCase(c));
		}

		// for (char c : str.toCharArray()) {
		// 	// 소문자 : 97 ~ 122
		// 	// 대문자 : 65 ~90
		// 	if (c >= 97 && c <= 122) sb.append((char)(c - 32));
		// 	else sb.append((char)(c + 32));
		// }

		return sb.toString();
	}
}
