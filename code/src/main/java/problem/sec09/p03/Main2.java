package problem.sec09.p03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// lecture
public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s, 's'));
			arr.add(new Time(e, 'e'));
		}

		System.out.println(solution(arr));
	}

	private static int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for (Time ob : arr) {
			if (ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	static class Time implements Comparable<Time> {
		public int time;
		public char state;

		public Time(int time, char state) {
			this.time = time;
			this.state = state;
		}

		@Override
		public int compareTo(Time o) {
			if (this.time == o.time) return this.state - o.state;
			else return this.time - o.time;
		}

		@Override
		public String toString() {
			return "Time{" +
				"time=" + time +
				", state=" + state +
				'}';
		}
	}
}

