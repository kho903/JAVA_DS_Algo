package doit_algo_boj.silver._1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 물통_2251_v2 {
	static int[] Sender = {0, 0, 1, 1, 2, 2};
	static int[] Receiver = {1, 2, 0, 2, 0, 1};
	static boolean[][] visited;
	static boolean[] answer;
	static int[] now;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		now = new int[3];
		now[0] = sc.nextInt();
		now[1] = sc.nextInt();
		now[2] = sc.nextInt();
		visited = new boolean[201][201];
		answer = new boolean[201];
		BFS();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i]) System.out.print(i + " ");
		}
	}

	private static void BFS() {
		Queue<AB> q = new LinkedList<>();
		q.add(new AB(0, 0));
		visited[0][0] = true;
		answer[now[2]] = true;
		while (!q.isEmpty()) {
			AB p = q.poll();
			int A = p.A;
			int B = p.B;
			int C = now[2] - A - B;
			// A -> B, A -> C, B -> A, B -> C, C -> A, C -> B
			for (int k = 0; k < 6; k++) {
				int[] next = {A, B, C};
				next[Receiver[k]] += next[Sender[k]];
				next[Sender[k]] = 0;
				if (next[Receiver[k]] > now[Receiver[k]]) {
					next[Sender[k]] = next[Receiver[k]] - now[Receiver[k]];
					next[Receiver[k]] = now[Receiver[k]];
				}
				if (!visited[next[0]][next[1]]) {
					visited[next[0]][next[1]] = true;
					q.add(new AB(next[0], next[1]));
					if (next[0] == 0) answer[next[2]] = true;
				}
			}
		}
	}

	static class AB {
		int A;
		int B;

		public AB(int a, int b) {
			A = a;
			B = b;
		}
	}
}
