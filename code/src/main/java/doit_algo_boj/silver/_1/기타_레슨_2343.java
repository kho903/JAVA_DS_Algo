package doit_algo_boj.silver._1;

import java.util.Scanner;

public class 기타_레슨_2343 {
	static int N, M;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int start = 0;
		int end = 0;
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			int l = sc.nextInt();
			arr[i] = l;
			start = Math.max(start, l);
			end += l;
		}

		System.out.println(solution(start, end));

	}

	private static int solution(int start, int end) {
		while (start <= end) {
			int mid = (start +  end) / 2;

			int sum = 0;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (sum + arr[i] > mid) {
					cnt++;
					sum = 0;
				}
				sum += arr[i];
			}
			if (sum != 0) cnt += 1;
			if (cnt > M) start = mid + 1;
			else end = mid - 1;
		}
		return start;
	}
}
