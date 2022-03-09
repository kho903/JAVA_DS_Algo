package problem.sec01.p11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution2(str));
	}

	// my solution
	private static String solution(String str) {
		char[] chars = str.toCharArray();
		StringBuilder answer = new StringBuilder();
		int count = 1;
		char cur = 'a';
		for (char c : chars) {
			if (c != cur) {
				if (cur != 'a')
					answer.append(cur);
				if (count != 1)
					answer.append(count);
				cur = c;
				count = 1;
			} else {
				count++;
			}
		}
		answer.append(cur);
		if (count != 1)
			answer.append(count);
		return answer.toString();
	}

	// lecture
	public static String solution2(String s) {
		String answer = "";
		s = s + " ";
		int cnt = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				cnt++;
			else {
				answer += s.charAt(i);
				if (cnt > 1)
					answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}
}
