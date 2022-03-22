package problem.sec07.recursive.p04;

import java.util.Scanner;

public class Main {
	static long[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new long[n];
		for (long x : fibo(n)) {
			System.out.print(x + " ");
		}

	}

	private static long[] fibo(int n) {
		if (n == 1) arr[n - 1] = 1;
		else if (n == 2) {
			arr[1] = 1;
			fibo(n - 1);
		} else {
			fibo(n - 1);
			arr[n - 1] = arr[n - 2] + arr[n - 3];
		}
		return arr;
	}

}
