package programmers.lv01._3진법뒤집기;

public class Solution {

	public static int solution(int n) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
		StringBuilder sb2 = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != '0' || flag) {
				flag = true;
				sb2.append(sb.charAt(i));
			}
		}
		int x = 1;
		for (int i = sb2.length() - 1; i >= 0; i--) {
			answer += Character.getNumericValue(sb2.charAt(i)) * x;
			x *= 3;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
	}
}
