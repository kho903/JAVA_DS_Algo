package problem.sec08.bfs.p11;

import java.util.Scanner;

public class Main {
	static int[][] arr = new int[7][7];;
	static int[][] ch = new int[7][7];
	static int[] dx = new int[] {0, 1, 0, -1};
	static int[] dy = new int[] {1, 0, -1, 0};
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dfs(0, 0, 0);
		if (ans == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);
	}

	private static void dfs(int x, int y, int cnt) {
		if (x == 6 && y == 6) {
			ans = Math.min(ans, cnt);
		} else {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if ((nx < 0 || nx >= 7) || (ny < 0 || ny >= 7) || ch[nx][ny] == 1) {
				} else {
					if (arr[nx][ny] == 0) {
						ch[nx - dx[i]][ny - dy[i]] = 1;
						dfs(nx, ny, cnt + 1);
						ch[nx - dx[i]][ny - dy[i]] = 0;
					}
				}
			}
		}
	}

}
