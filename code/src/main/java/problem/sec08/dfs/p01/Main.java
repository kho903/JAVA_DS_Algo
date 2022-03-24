package problem.sec08.dfs.p01;

import java.util.Scanner;

// my solution before lecture
// time limit
public class Main {
	static int n, total = 0;
	static String answer = "NO";
	static int[] checked;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		checked = new int[n + 1];
		dfs(0, 0, arr);
		System.out.println(answer);
	}

	private static void dfs(int L, int sum, int[] arr) {
		if (sum == total - sum){
			answer = "YES";
			return;
		} else if (sum > total - sum || L == n - 1) {
			return;
		}
		for (int i = L; i < arr.length; i++) {
			if (checked[i] == 0) {
				checked[i] = 1;
				dfs(L + 1, sum + arr[i], arr);
				checked[i] = 0;
				dfs(L + 1, sum, arr);
			}
		}
	}
}
