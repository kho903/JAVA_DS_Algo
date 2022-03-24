package problem.sec09.p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// lecture
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr= new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x, y));
		}
		System.out.println(solution(arr, n));
	}

	private static int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for (Time t : arr) {
			if (t.s >= et) {
				cnt++;
				et = t.e;
			}
		}
		return cnt;
	}

	private static class Time implements Comparable<Time> {
		public int s, e;

		public Time(int s, int e) {
			this.s = s;
			this.e = e;
		}

		@Override
		public int compareTo(Time o) {
			if (this.e == o.e) return this.s - o.s;
			else return this.e - o.e;
		}
	}
}
