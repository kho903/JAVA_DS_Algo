package chap02_stack.algo;

import java.util.Scanner;
import java.util.Stack;

// 9012
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			solution(sc.next());
		}
	}

	private static void solution(String s) {
		Stack<Character> stack = new Stack<>();
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			if (c == '(')
				stack.push(c);
			else {
				if (stack.isEmpty()) {
					System.out.println("NO");
					return;
				}
				stack.pop();
			}
			i++;
		}
		if (!stack.isEmpty())
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
