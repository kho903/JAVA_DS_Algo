package programmers.lv02.짝지어_제거하기;

import java.util.Stack;

public class Solution {

	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (stack.isEmpty()) stack.push(s.charAt(i));
			else if (stack.peek() == s.charAt(i)) stack.pop();
			else stack.push(s.charAt(i));
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
