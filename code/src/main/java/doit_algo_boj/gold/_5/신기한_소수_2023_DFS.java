package doit_algo_boj.gold._5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// my solution
public class 신기한_소수_2023_DFS {
	static String[] start = new String[] {"2", "3", "5", "7"};
	static String[] next = new String[] {"1", "3", "7", "9"};
	static ArrayList<String> ans = new ArrayList<>();
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		dfs(0, start[0], 1);
		Collections.sort(ans);
		for (String x : ans) {
			System.out.println(x);
		}
	}

	private static void dfs(int index, String s, int x) {
		if (x == N){
			if (!ans.contains(s))
				ans.add(s);
			if (index + 1 < 4)
				dfs(index + 1, start[index + 1], 1);
			return;
		}
		else {
			for (int i = 0; i < 4; i++) {
				if (isPrime(s + next[i])) {
					dfs(index, s + next[i], x + 1);
				}
			}
		}
	}

	private static boolean isPrime(String s) {
		int x = Integer.parseInt(s);
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) return false;
		}
		return true;
	}
}
