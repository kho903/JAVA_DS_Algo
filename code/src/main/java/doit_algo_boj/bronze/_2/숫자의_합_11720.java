package doit_algo_boj.bronze._2;

import java.util.Scanner;

public class 숫자의_합_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		char[] ch = s.toCharArray();
		int sum = 0;
		for (char c : ch) {
			sum += c - '0';
		}
		System.out.println(sum);
	}
}
