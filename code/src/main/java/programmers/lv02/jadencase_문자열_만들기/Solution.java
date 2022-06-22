package programmers.lv02.jadencase_문자열_만들기;

public class Solution {
	public static String solution(String s) {
		StringBuilder answer = new StringBuilder();
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i == 0) {
				if (97 <= (int)ch && (int)ch <= 122) {
					ch -= 32;
				}
			} else if (s.charAt(i - 1) == ' ' &&  97 <= (int)ch && (int)ch <= 122) {
				ch -= 32;
			}
			answer.append(ch);
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"	));
	}
}
