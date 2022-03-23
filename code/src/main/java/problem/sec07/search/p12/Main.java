package problem.sec07.search.p12;

import java.util.Scanner;

/**
 * 입력값 :
 * 첫째줄 n, m,
 * 2~m번째 줄 : 연결 정보

5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

 **/
// my solution
public class Main {
	static int n, m;
	static int[][] arr;
	static int[] checked;
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n + 1][n + 1];
		checked = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
		}
		checked[1] = 1;
		count(1, n);
		System.out.println(cnt);
	}
	private static void count(int x, int n) {
		if (x == 5) cnt++;
		else {
			for (int i = 2; i <= n; i++) {
				if (arr[x][i] == 1 && checked[i] != 1) {
					checked[i] = 1;
					count(i, n);
					checked[i] = 0;
				}
			}
		}
	}
}

