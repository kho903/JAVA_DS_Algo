package problem.sec08.dfs.p04;

import java.util.ArrayList;
import java.util.Scanner;

// my solution - math
public class Main {
	static int n, m;
	static ArrayList<int[]> answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		answer = new ArrayList<>();
		for (int i = 0; i < n * n; i++) {
			answer.add(new int[] {(i / n) + 1, (i % n) + 1});
		}
		for (int[] x : answer) {
			System.out.println(x[0] + " " + x[1]);
		}
	}

}
