package doit_algo_boj.silver._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와_BFS_1260 {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(bf.readLine());

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int V = Integer.parseInt(stk.nextToken());

		arr = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(arr[i]);
		}

		visited = new boolean[N + 1];
		dfs(V);
		System.out.println();
		visited = new boolean[N + 1];
		bfs(V);

	}

	private static void dfs(int start) {
		System.out.print(start + " ");
		visited[start] = true;
		for (Integer i : arr[start]) {
			if (!visited[i]) dfs(i);
		}
	}

	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		while (!q.isEmpty()) {
			int next = q.poll();
			System.out.print(next + " ");
			for (Integer i : arr[next]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}

}
