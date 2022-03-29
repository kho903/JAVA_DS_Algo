package problem.sec08.bfs.p13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, ans = 0;
	static int[][] island;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static Queue<Point> q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		island = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				island[i][j] = sc.nextInt();
			}
		}

		solution(island);
		System.out.println(ans);
	}

	private static void solution(int[][] island) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (island[i][j] == 1) {
					ans++;
					island[i][j] = 0;
					bfs(i, j, island);
				}
			}
		}
	}

	private static void bfs(int x, int y, int[][] island) {
		q.add(new Point(x, y));
		while (!q.isEmpty()) {
			Point pos = q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < n && island[nx][ny] == 1) {
					island[nx][ny] = 0;
					q.add(new Point(nx, ny));
				}
			}
		}
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
