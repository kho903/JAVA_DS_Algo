package programmers.lv02._124나라의_숫자;

import java.util.ArrayList;

public class Solution {
	public String solution(int n) {
		StringBuilder answer = new StringBuilder();
		char[] arr = new char[] {'4', '1','2'};
		ArrayList<Character> ch = new ArrayList<>();
		while (n > 0) {
			ch.add(arr[n % 3]);
			n = (n - 1) / 3;
		}
		for (int i = ch.size() - 1; i >= 0; i--) {
			answer.append(ch.get(i));
		}
		return answer.toString();
	}
}
