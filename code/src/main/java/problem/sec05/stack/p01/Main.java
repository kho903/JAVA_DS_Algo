package problem.sec05.stack.p01;

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
		for (char c : str.toCharArray()) {
			if (c == '(') s.push(c);
			else {
				if (s.isEmpty()) return "NO";
				s.pop();
			}
		}
		if (s.isEmpty()) return "YES";
		else return "NO";
	}
}
