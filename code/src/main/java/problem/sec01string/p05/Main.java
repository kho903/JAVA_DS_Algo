package problem.sec01string.p05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution2(str));
	}

	// my solution
	public static String solution(String str) {
		char[] ch = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if ((('a' <= ch[lt] && ch[lt] <= 'z') ||
				('A' <= ch[lt] && ch[lt] <= 'Z')) &&
				(('a' <= ch[rt] && ch[rt] <= 'z') ||
					('A' <= ch[rt] && ch[rt] <= 'Z'))) {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			} else if (('a' <= ch[lt] && ch[lt] <= 'z') ||
				('A' <= ch[lt] && ch[lt] <= 'Z')) {
				rt--;
			} else {
				lt++;
			}
		}
		return String.valueOf(ch);
	}

	// lecture
	public static String solution2(String str) {
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt])) lt++;
			else if (!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		return String.valueOf(s);
	}
}
