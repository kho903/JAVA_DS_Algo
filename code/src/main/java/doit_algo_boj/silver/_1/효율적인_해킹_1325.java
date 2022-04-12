package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 효율적인_해킹_1325 {
	static int N, M;
	static ArrayList<Integer>[] arr;
	static int[] checked;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());

		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());

		arr = new ArrayList[N + 1];
		checked = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			arr[a].add(b);
		}

		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1];
			bfs(i);
		}

		int max = 0;
		for (int i : checked) {
			max = Math.max(max, i);
		}

		for (int i = 0; i <= N; i++) {
			if (checked[i] == max) bw.append(String.valueOf(i)).append(" ");
		}
		bw.flush();
		bw.close();

	}

	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.add(x);
		visited[x] = true;
		while (!q.isEmpty()) {
			int p = q.poll();
			for (int i : arr[p]) {
				if (!visited[i]) {
					q.add(i);
					visited[i] = true;
					checked[i]++;
				}
			}
		}
	}
}
