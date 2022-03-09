package problem.sec01.p10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		// my solution
		/*String t = sc.next();
		int[] res = solution(s, t);
		for (int re : res) {
			System.out.printf("%d ",re);
		}*/

		// lecture
		char c = sc.next().charAt(0);
		for (int x : solution2(s, c)) {
			System.out.print(x + " ");
		}
	}

	// my solution
	private static int[] solution(String s, String t) {
		int p = 101;
		int sLen = s.length();
		int[] left = new int[sLen];
		int[] right = new int[sLen];
		int[] res = new int[sLen];
		int l = 100;
		for (int i = 0; i < sLen; i++) {
			if (s.charAt(i) == t.charAt(0)) {
				l = 0;
			} else {
				l++;
			}
			left[i] = l;
		}
		int r = 100;
		for (int i = sLen - 1; i >= 0; i--) {
			if (s.charAt(i) == t.charAt(0)) {
				r = 0;
			} else {
				r++;
			}
			right[i] = r;
		}
		for (int i = sLen - 1; i >= 0; i--) {
			if (left[i] < right[i]) {
				res[i] = left[i];
			} else {
				res[i] = right[i];
			}
		}
		return res;
	}

	// lecture
	public static int[] solution2(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == t) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
}
