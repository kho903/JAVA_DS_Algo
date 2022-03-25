package problem.sec09.p03;

import java.util.ArrayList;
import java.util.Scanner;

// after lecture my solution
public class Main {

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
		int answer = 0;
		int cnt = 1;
		for (Time time : arr) {
			if (time.status == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	private static class Time implements Comparable<Time> {
		int time;
		char status;

		public Time(int time, char status) {
			this.time = time;
			this.status = status;
		}

		@Override
		public int compareTo(Time o) {
			if (this.time == o.time) return this.status - o.status;
			return this.time - o.time;
		}
	}
}
