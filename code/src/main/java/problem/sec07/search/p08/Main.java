package problem.sec07.search.p08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// my solution
public class Main {
	static int[] d = {-1, 1, 5};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(solution(s, e));
	}

	private static int solution(int s, int e) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		int L = 0;
		int[] checked = new int[e + 6];
		checked[s] = 1;
		while (answer != e) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int cur = q.poll();
				for (int j = 0; j < 3; j++) {
					if (cur + d[j] == e)
						answer = e;
					else if (cur + d[j] < e + 6 && cur + d[j] >= 0 && checked[cur + d[j]] == 0) {
						checked[cur + d[j]] = 1;
						q.offer(cur + d[j]);
					}
				}
			}
			L++;
		}
		return L;
	}
}
