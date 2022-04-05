package programmers.lv01.수박수박수박수;

public class Solution {

	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < n) {
			if (i % 2 == 0) sb.append("수");
			else sb.append("박");
			i++;
		}
		return sb.toString();
	}
}
