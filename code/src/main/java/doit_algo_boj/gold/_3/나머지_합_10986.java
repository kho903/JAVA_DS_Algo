package doit_algo_boj.gold._3;

import java.util.Scanner;

public class 나머지_합_10986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] arr = new long[N];
		long[] remainCnt = new long[M];
		arr[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			arr[i] = arr[i - 1] +  sc.nextInt();
		}

		long cnt = 0;
		for (int i = 0; i < N; i++) {
			int x = (int) (arr[i] % M);
			if (x == 0) cnt++;
			remainCnt[x]++;
		}
		
		for (int i = 0; i < M; i++) {
			if (remainCnt[i] > 1)
				cnt += (remainCnt[i] * (remainCnt[i] - 1) / 2);
		}
		System.out.println(cnt);
	}
}
