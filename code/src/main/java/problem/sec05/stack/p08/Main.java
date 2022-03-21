package problem.sec05.stack.p08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) q.offer(arr[i]);
		boolean d = true;
		while (d) {
			int pollValue = q.poll();
			for (int i = pollValue + 1; i <= 100; i++) {
				if (q.contains(i)) {
					q.offer(pollValue);
					if (m == 0) m = q.size();
					m--;
					break;
				} else if (i == 100) {
					answer++;
					if (m == 0) {
						d = false;
						break;
					}
					m--;
				}
			}
		}
		return answer;
	}
}
