package doit_algo_boj.silver._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로_탐색_2178 {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr;
	static boolean[][] visited;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());

		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		arr = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			stk = new StringTokenizer(br.readLine());
			String s = stk.nextToken();
			for (int j = 0; j < M; j++)
				arr[i][j] = s.charAt(j) - '0';
		}
		bfs(0, 0);
		System.out.println(arr[N - 1][M - 1]);
	}

	private static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i, j});
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			visited[cur[0]][cur[1]] = true;
			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];
				if (0 <= nx && nx < N && 0 <= ny && ny < M) {
					if (arr[nx][ny] != 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						arr[nx][ny] = arr[cur[0]][cur[1]] + 1;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}

	}
}
