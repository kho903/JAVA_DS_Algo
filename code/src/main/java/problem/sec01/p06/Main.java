package problem.sec01.p06;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution2(str));
	}

	// my solution
	private static String solution(String str) {
		String[] strArr = str.split("");
		String[] resultArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
		return String.join("", resultArr);
	}

	// lecture
	public static String solution2(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}
}
