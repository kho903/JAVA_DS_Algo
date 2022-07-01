package programmers.lv01.신규아이디추천;

public class Solution {

	public static String solution(String new_id) {
		// 1단계
		new_id = new_id.toLowerCase();
		StringBuilder sb = new StringBuilder();
		// 2단계
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if (check2(ch))
				sb.append(ch);
		}

		String second = sb.toString();
		StringBuilder sb2 = new StringBuilder();
		// 3단계
		boolean flag = false;
		sb2.append(second.charAt(0));
		if (second.charAt(0) == '.') flag = true;
		for (int i = 1; i < second.length(); i++) {
			if (second.charAt(i) == '.') {
				if (flag)
					continue;
				sb2.append(second.charAt(i));
				flag = true;
			} else {
				sb2.append(second.charAt(i));
				flag = false;
			}
		}
		// 4단계
		if (sb2.charAt(0) == '.') sb2.delete(0,1);
		if (sb2.length() > 1)
			if (sb2.charAt(sb2.length() - 1) == '.')
				sb2.delete(sb2.length() - 1, sb2.length());

		// 5단계
		if (sb2.length() == 0) sb2.append('a');

		// 6단계
		if (sb2.length() > 15)
			sb2.delete(15, sb2.length());
		if (sb2.charAt(sb2.length() - 1) == '.')
			sb2.delete(sb2.length() - 1, sb2.length());

		// 7단계
		if (sb2.length() <= 2)
			while (sb2.length() < 3)
				sb2.append(sb2.charAt(sb2.length() - 1));

		return sb2.toString();
	}

	private static boolean check2(char ch) {
		if (Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch =='.')
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));

	}
}
