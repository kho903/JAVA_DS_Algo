package problem.sec05.stack.p07;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String required = sc.next();
		String plan = sc.next();
		System.out.println(solution(required, plan));
	}

	private static String solution(String required, String plan) {
		Stack<Character> stack = new Stack<>();
		for (int i = required.length() - 1; i >= 0; i--) {
			stack.push(required.charAt(i));
		}
		char[] pl = plan.toCharArray();
		for (char c : pl) {
			if (stack.contains(c)) {
				if (stack.pop() != c) return "NO";
			}
		}

		if (stack.isEmpty()) return "YES";
		else return "NO";
	}
}
