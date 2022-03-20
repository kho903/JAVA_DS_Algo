package problem.sec05.stack.p04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c))
				stack.push(Character.getNumericValue(c));
			else {
				answer = 0;
				int b = stack.pop();
				int a = stack.pop();
				if (c == '+') {
					answer += (a + b);
				} else if (c == '-') {
					answer += (a - b);
				} else if (c == '*') {
					answer += (a * b);
				} else if (c == '/') {
					answer += (a / b);
				}
				stack.push(answer);
			}

		}
		return answer;
	}
}
