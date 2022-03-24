package problem.sec09.p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// after lecture
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Meeting> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Meeting(a, b));
		}
		Collections.sort(arr);
		System.out.println(solution(n, arr));
	}

	private static int solution(int n, ArrayList<Meeting> arr) {
		int cnt = 0;
		int curEnd = 0;
		for (Meeting meeting : arr) {
			if (meeting.start >= curEnd) {
				cnt++;
				curEnd = meeting.end;
			}
		}
		return cnt;
	}

	static class Meeting implements Comparable<Meeting> {
		int start, end;

		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			if (this.end == o.end) return this.start - o.start;
			return this.end - o.end;
		}
	}
}
