package problem.sec01.p09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution2(str));
	}

	// my solution
	private static int solution(String str) {
		char[] ch = str.toCharArray();
		StringBuilder answer = new StringBuilder();
		for (char c : ch) {
			if (Character.isDigit(c))
				answer.append(c);
		}
		return Integer.parseInt(answer.toString());
	}

	// lecture
	public static int solution2(String s) {
		int answer = 0;
		for (char x : s.toCharArray()) {
			if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
		}
		return answer;
	}
}
