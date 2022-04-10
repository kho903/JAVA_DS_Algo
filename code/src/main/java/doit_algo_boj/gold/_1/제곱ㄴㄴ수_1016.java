package doit_algo_boj.gold._1;

import java.util.Scanner;

public class 제곱ㄴㄴ수_1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();

		boolean[] checked = new boolean[(int) (max - min + 1)];

		for (long i = 2; i * i <= max; i++) {
			long pow = i * i;
			long s = min / pow;
			if (min % pow != 0) s++;
			for (long j = s; j * pow <= max; j++) {
				checked[(int) (j * pow - min)] = true;
			}
		}

		int cnt = 0;
		for (boolean b : checked) {
			if (!b) cnt++;
		}

		System.out.println(cnt);
	}
}
