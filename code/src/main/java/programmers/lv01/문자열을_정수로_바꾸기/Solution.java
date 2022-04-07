package programmers.lv01.문자열을_정수로_바꾸기;

public class Solution {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
	}

	public static int solution(String s) {
		int N = s.length();
		if (s.charAt(0) == '-') {
			String s1 = s.substring(1, N);
			int x = Integer.parseInt(s1);
			return -x;
		} else {
			return Integer.parseInt(s);
		}
	}
}
