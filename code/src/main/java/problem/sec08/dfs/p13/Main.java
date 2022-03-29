package problem.sec08.dfs.p13;

import java.util.Scanner;

public class Main {
	static int n, ans = 0;
	static int[][] island;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
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
					dfs(i, j, island);
				}
			}
		}
	}

	private static void dfs(int x, int y, int[][] island) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && island[nx][ny] == 1) {
				island[nx][ny] = 0;
				dfs(nx, ny, island);
			}
		}
	}
}
