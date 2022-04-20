package doit_algo_boj.bronze._2;

import java.util.Scanner;

public class 농구_경기_1159 {
	static int[] arr = new int[26];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			arr[s.charAt(0) - 97]++;
		}
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				flag = true;
				System.out.print((char)(i + 97));
			}
		}
		if (!flag) System.out.println("PREDAJA");
	}
}
