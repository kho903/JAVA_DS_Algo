package programmers.lv02.전화번호_목록;

import java.util.Arrays;

public class Solution {
	public static boolean solution(String[] phone_book) {

		Arrays.sort(phone_book);
		System.out.println(Arrays.toString(phone_book));

		for (int i = 1; i < phone_book.length; i++) {
			String s1 = phone_book[i - 1];
			String s2 = phone_book[i];
			if (s1.length() > s2.length()) continue;
			boolean flag = true;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s2.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[] {
			"119", "97674334", "1195524421"
		}));
		System.out.println(solution(new String[] {
			"123","456","789"
		}));
		System.out.println(solution(new String[] {
			"12","123","1235", "567", "88"
		}));
	}
}
