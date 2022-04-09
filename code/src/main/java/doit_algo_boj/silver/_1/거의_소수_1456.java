package doit_algo_boj.silver._1;

import java.util.Scanner;

public class 거의_소수_1456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();

		long[] arr = new long[10000001];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = i + i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}

		int cnt = 0;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) {
				long cur = arr[i];
				while ((double)arr[i] <= (double)B / (double)cur) {
					if ((double)A / (double)cur <= (double)arr[i]) {
						cnt++;
					}
					cur *= arr[i];
				}
			}
		}
		System.out.println(cnt);
	}

}
