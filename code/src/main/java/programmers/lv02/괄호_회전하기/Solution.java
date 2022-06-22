package programmers.lv02.괄호_회전하기;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public static int solution(String s) {
		int answer = 0;
		int N = s.length();

		Stack<Character> stack = new Stack<>();
		ArrayList<Character> arr = new ArrayList<>();
		for (char c : s.toCharArray()) {
			arr.add(c);
		}

		for (int c = 0; c < N; c++) {
			boolean flag = true;
			for (int i = 0; i < N; i++) {

				if (arr.get(i) == '(' || arr.get(i) == '[' || arr.get(i) == '{')
					stack.push(arr.get(i));

				if (arr.get(i) == ')' || arr.get(i) == ']' || arr.get(i) == '}') {
					if (stack.isEmpty()) {
						flag = false;
						break;
					}
					Character pop = stack.pop();
					if (!((pop == '(' && arr.get(i) == ')') || (pop == '{' && arr.get(i) == '}') || (pop == '['
						&& arr.get(i) == ']'))) {
						flag = false;
						break;
					}
				}

				if (i == N - 1 && !stack.isEmpty())
					flag = false;
			}
			if (flag) answer++;
			Character remove = arr.remove(0);
			arr.add(remove);
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("[](){}"));
		System.out.println(solution("}]()[{"));
		System.out.println(solution("[)(]"));
		System.out.println(solution("}}}"));
	}
}
