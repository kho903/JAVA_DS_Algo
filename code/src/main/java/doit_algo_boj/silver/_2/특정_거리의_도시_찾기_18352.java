package doit_algo_boj.silver._2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 특정_거리의_도시_찾기_18352 {
	static ArrayList<Integer>[] arr;
	static int N, M, K, X;
	static ArrayList<Integer> ans;
	static int[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		X = sc.nextInt();

		arr = new ArrayList[N + 1];
		visited = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}

		for (int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
		}

		ans = new ArrayList<>();
		bfs(X);
		for (int i = 0; i <= N; i++) {
			if (visited[i] == K)
				ans.add(i);
		}

		Collections.sort(ans);

		if (ans.size() == 0)
			System.out.println(-1);
		else {
			for (Integer x : ans) {
				System.out.println(x);
			}
		}

	}

	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		visited[node]++;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (Integer x : arr[cur]) {
				if (visited[x] == -1) {
					visited[x] = visited[cur] + 1;
					q.add(x);
				}
			}
		}
	}

}
