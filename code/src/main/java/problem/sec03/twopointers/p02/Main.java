package problem.sec03.twopointers.p02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for (int x : solution(n, m, a, b)) {
			System.out.print(x + " ");
		}
	}

	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> answer = new ArrayList<>();
		int n1 = 0, m1 = 0;
		while (n1 < n && m1 < m) {
			if (a[n1] == b[m1]) {
				answer.add(a[n1++]);
				m1++;
			} else if (a[n1] < b[m1])
				n1++;
			else
				m1++;
		}
		return answer;
	}
}
