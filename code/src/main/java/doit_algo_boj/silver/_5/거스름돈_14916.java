package doit_algo_boj.silver._5;

import java.util.Scanner;

public class 거스름돈_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		if (n % 5 == 0)
			System.out.println(n / 5);
		else {
			while (true) {
				if (n < 0) {
					System.out.println(-1);
					break;
				}

				n -= 2;
				cnt++;

				if (n % 5 == 0) {
					cnt += n / 5;
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
