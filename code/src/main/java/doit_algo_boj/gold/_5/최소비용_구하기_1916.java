package doit_algo_boj.gold._5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최소비용_구하기_1916 {
	static int N, M;
	static ArrayList<Node>[] arr;
	static int[] dist;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		arr = new ArrayList[N + 1];
		dist = new int[N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i <= N; i++) {
			dist[i] = Integer.MAX_VALUE;
			arr[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(stk.nextToken());
			int e = Integer.parseInt(stk.nextToken());
			int w = Integer.parseInt(stk.nextToken());
			arr[s].add(new Node(e, w));
		}
		stk = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(stk.nextToken());
		int end = Integer.parseInt(stk.nextToken());

		System.out.println(solution(start, end));
	}

	private static int solution(int start, int end) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.offer(new Node(start, 0));
		dist[start] = 0;
		while (!q.isEmpty()) {
			Node cur = q.poll();
			int curN = cur.n;
			if (!visited[curN]) {
				visited[curN] = true;
				for (Node node : arr[curN]) {
					if (!visited[node.n] && dist[node.n] > dist[curN] + node.weight) {
						dist[node.n] = dist[curN] + node.weight;
						q.add(new Node(node.n, dist[node.n]));
					}
				}
			}
		}
		return dist[end];
	}

	private static class Node implements Comparable<Node> {
		int n;
		int weight;

		public Node(int n, int weight) {
			this.n = n;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
}
