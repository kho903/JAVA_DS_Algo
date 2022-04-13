package doit_algo_boj.gold._5;

import java.util.ArrayList;
import java.util.Scanner;

public class 트리_1068 {
	static ArrayList<Integer>[] tree;
	static boolean[] visited;
	static int N, delIndex;
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int root = 0;
		tree = new ArrayList[N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			tree[i] = new ArrayList<>();
		}

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (a == - 1) {
				root = i;
			} else {
				tree[a].add(i);
				tree[i].add(a);
			}
		}
		delIndex = sc.nextInt();
		dfs(root);
		System.out.println(ans);
	}

	private static void dfs(int x) {
		visited[x] = true;
		if (x == delIndex) {

		}
		else {
			boolean p = false;
			for (Integer cur : tree[x]) {
				if (cur == delIndex) continue;
				if (!visited[cur]) {
					p = true;
					dfs(cur);
				}
			}
			if (!p) ans++;
		}
	}
}
