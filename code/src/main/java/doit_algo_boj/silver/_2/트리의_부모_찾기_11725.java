package doit_algo_boj.silver._2;

import java.util.ArrayList;
import java.util.Scanner;

public class 트리의_부모_찾기_11725 {
	static ArrayList<Integer>[] tree;
	static boolean[] visited;
	static int[] ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		tree = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		ans = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			tree[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			tree[a].add(b);
			tree[b].add(a);
		}

		dfs(1);

		for (int i = 2; i < ans.length; i++) {
			sb.append(ans[i]).append("\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int x) {
		visited[x] = true;
		for (Integer t : tree[x]) {
			if (!visited[t]) {
				ans[t] = x;
				dfs(t);
			}
		}
	}
}
