package problem.sec07.search.p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	static int n, m, cnt = 0;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] checked;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new ArrayList<>();
		checked = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.get(a).add(b);
		}
		checked[1] = 1;
		dfs(1);
		System.out.println(cnt);
	}

	private static void dfs(int x) {
		if (x == n) cnt++;
		else {
			for (int nv : arr.get(x)) {
				if (checked[nv] == 0) {
					checked[nv] = 1;
					dfs(nv);
					checked[nv] = 0;
				}
			}
		}
	}

}
