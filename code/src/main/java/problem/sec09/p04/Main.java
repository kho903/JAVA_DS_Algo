package problem.sec09.p04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int pay = sc.nextInt();
			int day = sc.nextInt();
			arr.add(new Lecture(pay, day));
		}

		Collections.sort(arr);
		System.out.println(solution(arr));
	}

	private static int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		int max = arr.get(0).day;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int j = 0;
		for (int i = max; i > 0; i--) {
			for (; j < n; j++) {
				if (arr.get(j).day < i) break;
				q.offer(arr.get(j).pay);
			}
			if (!q.isEmpty()) answer += q.poll();
		}
		return answer;
	}

	private static class Lecture implements Comparable<Lecture> {
		int pay;
		int day;

		public Lecture(int pay, int day) {
			this.pay = pay;
			this.day = day;
		}

		@Override
		public int compareTo(Lecture o) {
			return o.day - this.day;
		}

		@Override
		public String toString() {
			return "Lecture{" +
				"pay=" + pay +
				", day=" + day +
				'}';
		}
	}
}
