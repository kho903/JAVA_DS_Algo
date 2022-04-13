package doit_algo_boj.gold._4;

import java.io.IOException;
import java.util.Scanner;

public class 여행_가자_1976 {
	static int[][] connect;
	static int[] plan;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		connect = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				connect[i][j] = sc.nextInt();
			}
		}
		arr = new int[N + 1];
		for (int i = 1; i <= N; i++) arr[i] = i;

		plan = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			plan[i] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (connect[i][j] == 1) union(i, j);
			}
		}

		int index = find(plan[1]);
		for (int i = 2; i <= M; i++) {
			if (index != find(plan[i])) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

	}

	private static void union(int i, int j) {
		i = find(i);
		j = find(j);
		if (i != j) arr[j] = i;
	}

	private static int find(int x) {
		if (x == arr[x]) return x;
		else return arr[x] = find(arr[x]);
	}

}
