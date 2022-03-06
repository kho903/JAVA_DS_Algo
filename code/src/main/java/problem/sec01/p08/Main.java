package problem.sec01.p08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp)) return "YES";
		return "NO";
	}
}
