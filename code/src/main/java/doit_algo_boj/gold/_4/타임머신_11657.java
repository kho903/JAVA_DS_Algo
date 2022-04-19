package doit_algo_boj.gold._4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 타임머신_11657 {
	static ArrayList<Node>[] arr;
	static long[] dis;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());

		arr = new ArrayList[N + 1];
		dis = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<>();
			dis[i] = Long.MAX_VALUE;
		}

		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			arr[a].add(new Node(b, c));
		}

		dis[1] = 0;
		boolean flag = false;
		boolean bellmanFord = false;
		for (int i = 1; i < N; i++) {
			flag = false;
			for (int j = 1; j <= N; j++) {
				for (Node node : arr[j]) {
					if (dis[j] == Long.MAX_VALUE) break;

					if (dis[node.e] > dis[j] + node.distance) {
						dis[node.e] = dis[j] + node.distance;
						flag = true;
					}
				}
			}

			if (!flag) break;
		}

		if (flag) {
			for (int i = 1; i <= N; i++) {
				for (Node node : arr[i]) {
					if (dis[i] == Long.MAX_VALUE) break;
					if (dis[node.e] > dis[i] + node.distance) {
						bellmanFord = true;
						break;
					}
				}
			}
		}

		if (bellmanFord) sb.append("-1\n");
		else {
			for (int i = 2; i <= N; i++) {
				if (dis[i] == Long.MAX_VALUE) sb.append("-1\n");
				else sb.append(dis[i]).append("\n");
			}
		}
		System.out.println(sb);
	}

	static class Node {
		int e;
		int distance;

		public Node(int e, int distance) {
			this.e = e;
			this.distance = distance;
		}
	}
}
