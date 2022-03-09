package problem.sec01string.p12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		// for (int n : solution(num, str)) {
		// 	System.out.print((char) n);
		// }
		System.out.println(solution3(num, str));
	}

	// my solution
	public static int[] solution(int num, String str) {
		String[] strings = splitSeven(num, str);
		int[] numAnswer = new int[num];
		int index = 0;
		for (String string : strings) {
			for (int i = 6; i >= 0; i--) {
				if (string.charAt(i) == '#') {
					int pow = (int)Math.pow(2, 6 - i);
					numAnswer[index] += pow;
				}
			}
			index++;
		}

		return numAnswer;
	}

	// my solution
	public static String[] splitSeven(int num, String str) {
		String[] splitStr = new String[num];
		int cnt = 0;
		String cur = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			cur += str.charAt(i);
			cnt++;

			if (cnt == 7) {
				splitStr[j++] = cur;
				cur = "";
				cnt = 0;
			}
		}
		return splitStr;
	}

	// lecture
	public static String solution2(int n, String s) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			// 2진수 -> 10진수
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			s = s.substring(7);
		}
		return answer;
	}

	// review
	public static String solution3(int num, String str) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < num; i++) {
			String cur = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int n = Integer.parseInt(cur, 2);

			answer.append((char)n);
			str = str.substring(7);
		}
		return answer.toString();
	}
}
