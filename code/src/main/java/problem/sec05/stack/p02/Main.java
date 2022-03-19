package problem.sec05.stack.p02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		Stack<Character> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c == '(') s.push(c);
			else if (c == ')') s.pop();
			else if (s.isEmpty()) sb.append(c);
		}
		return sb.toString();
	}
}
