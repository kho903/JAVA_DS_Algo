package doit_algo_boj.gold._5;

import java.util.ArrayList;
import java.util.Scanner;

public class ABCDE_13023 {
	static ArrayList<Integer>[] arr;
	static int[] visited;
	static boolean arrive;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arrive = false;
		visited = new int[N];
		arr = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			arr[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
			arr[b].add(a);
		}

		for (int i = 0; i < N; i++) {
			dfs(i, 1);
			if (arrive) break;
		}
		if (arrive) System.out.println(1);
		else System.out.println(0);

	}

	private static void dfs(int i, int depth) {
		if (depth == 5 || arrive) {
			arrive = true;
			return;
		}
		visited[i] = 1;
		for (Integer integer : arr[i]) {
			if (visited[integer] == 0) {
				dfs(integer, depth + 1);
			}
		}
		visited[i] = 0;
	}
}
