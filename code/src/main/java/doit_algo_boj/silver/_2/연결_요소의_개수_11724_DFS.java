package doit_algo_boj.silver._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 연결_요소의_개수_11724_DFS {
	static List<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		arr = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		int count = 0;
		for (int j = 1; j <= N; j++) {
			if (!visited[j]) {
				count++;
				dfs(j);
			}
		}
		System.out.println(count);
	}

	private static void dfs(int x) {
		if (visited[x]) return;
		visited[x] = true;
		for (Integer t : arr[x]) {
			if (!visited[t]) dfs(t);
		}
	}
}
