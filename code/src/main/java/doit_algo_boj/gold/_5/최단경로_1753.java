package doit_algo_boj.gold._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최단경로_1753 {
	static ArrayList<Node>[] arr;
	static boolean[] visited;
	static int[] ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(stk.nextToken());
		int E = Integer.parseInt(stk.nextToken());

		int K = Integer.parseInt(br.readLine());
		arr = new ArrayList[V + 1];
		visited = new boolean[V + 1];

		for (int i = 0; i <= V; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			stk = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(stk.nextToken());
			int v = Integer.parseInt(stk.nextToken());
			int w = Integer.parseInt(stk.nextToken());
			arr[u].add(new Node(v, w));
		}

		ans = new int[V + 1];
		for (int i = 0; i <= V; i++) {
			ans[i] = Integer.MAX_VALUE;
		}
		ans[K] = 0;
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(K, 0));

		while (!q.isEmpty()) {
			Node cur = q.poll();
			int x = cur.n;
			if (visited[x]) continue;
			visited[x] = true;
			for (int i = 0; i < arr[x].size(); i++) {
				Node node = arr[x].get(i);
				if (ans[node.n] > ans[x] + node.weight) {
					ans[node.n] = ans[x] + node.weight;
					q.add(new Node(node.n, ans[node.n]));
				}
			}
		}
		for (int i = 1; i <= V; i++) {
			if (visited[i]) System.out.println(ans[i]);
			else System.out.println("INF");
		}
 	}

	static class Node implements Comparable<Node> {
		int n;
		int weight;

		public Node(int n, int weight) {
			this.n = n;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			if (this.weight > o.weight) return 1;
			else return -1;
		}
	}
}
