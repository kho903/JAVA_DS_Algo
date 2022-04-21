package doit_algo_boj.silver._5;

import java.util.Scanner;

public class _3의_배수_1769 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		int cnt = 0;
		while (x.length() >= 2) {
			cnt++;
			char[] chars = x.toCharArray();
			long cur = 0;
			for (char c : chars) {
				cur += c - '0';
			}
			x = String.valueOf(cur);
		}
		int ans = Integer.parseInt(x);
		System.out.println(cnt);
		if (ans % 3 == 0) System.out.println("YES");
		else System.out.println("NO");
	}
}
