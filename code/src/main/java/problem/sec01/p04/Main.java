package problem.sec01.p04;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for (String s : solution(n, str)) {
			System.out.println(s);
		}
	}

	private static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	private static ArrayList<String> solution2(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
}
