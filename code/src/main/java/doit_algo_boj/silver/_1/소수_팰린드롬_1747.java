package doit_algo_boj.silver._1;

import java.util.Scanner;

public class 소수_팰린드롬_1747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[10000001];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 2; i < Math.sqrt(arr.length); i++) {
			if (arr[i] == 0) continue;
			for (int j = i + i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = N; i < arr.length / 2; i++) {
			if (arr[i] == i && isPalindrome(arr[i])) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}
}
