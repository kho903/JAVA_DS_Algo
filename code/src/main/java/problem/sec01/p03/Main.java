package problem.sec01.p03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		int m = 0;

		String[] sp = str.split(" ");
		for (String s : sp) {
			int len = s.length();
			if (len > m) {
				m = len;
				answer = s;
			}
		}

		/*int m = 0, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > m) answer = str;*/
		return answer;
	}
}
