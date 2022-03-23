package problem.sec07.search.p13;

import java.util.ArrayList;
import java.util.Scanner;

// my solution
public class Main {
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
		solution(1);
		System.out.println(cnt);
	}

	private static void solution(int x) {
		if (x == 5) cnt++;
		else {
			for (int i = 0; i < arr.get(x).size(); i++) {
				int t = arr.get(x).get(i);
				if (checked[t] == 0) {
					checked[t] = 1;
					solution(t);
					checked[t] = 0;
				}
			}
		}
	}
}
