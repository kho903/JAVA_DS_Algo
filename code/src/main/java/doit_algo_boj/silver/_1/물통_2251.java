package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 물통_2251 {
	static int A, B, C;
	static ArrayList<Integer> ans;
	static boolean visited[][][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		ans = new ArrayList<>();
		A = Integer.parseInt(s[0]);
		B = Integer.parseInt(s[1]);
		C = Integer.parseInt(s[2]);
		visited = new boolean[A + 1][B + 1][C + 1];
		bfs();
		Collections.sort(ans);
		for (Integer x : ans) {
			System.out.print(x + " ");
		}
	}

	private static void bfs() {
		Queue<Water> q = new LinkedList<>();
		q.add(new Water(0, 0, C));
		while (!q.isEmpty()) {
			Water cur = q.poll();
			if (visited[cur.a][cur.b][cur.c]) continue;
			if (cur.a == 0) ans.add(cur.c);

			visited[cur.a][cur.b][cur.c] = true;
			// A -> B
			if (cur.a + cur.b <= B) {
				q.add(new Water(0, cur.a + cur.b, cur.c));
			} else {
				q.add(new Water(cur.a + cur.b - B, B, cur.c));
			}

			// A -> C
			if (cur.a + cur.c <= C) {
				q.add(new Water(0, cur.b, cur.a + cur.c));
			} else {
				q.add(new Water(cur.a + cur.c - C, cur.b, C));
			}

			// B -> A
			if (cur.a + cur.b <= A) {
				q.add(new Water(cur.a + cur.b, 0, cur.c));
			} else {
				q.add(new Water(A, cur.a + cur.b - A, cur.c));
			}

			// B -> C
			if (cur.b + cur.c <= C) {
				q.add(new Water(cur.a, 0, cur.b + cur.c));
			} else {
				q.add(new Water(cur.a, cur.b + cur.c - C, C));
			}

			// C -> A
			if (cur.a + cur.c <= A) {
				q.add(new Water(cur.a + cur.c, cur.b, 0));
			} else {
				q.add(new Water(A, cur.b, cur.a + cur.c - A));
			}

			// C -> B
			if (cur.b + cur.c <= B) {
				q.add(new Water(cur.a, cur.b + cur.c, 0));
			} else {
				q.add(new Water(cur.a, B, cur.b + cur.c - B));
			}
		}
	}

	static class Water {
		int a;
		int b;
		int c;

		public Water(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}
