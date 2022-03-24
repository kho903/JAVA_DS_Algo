package problem.sec09.p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// my solution before lecture
public class Main {
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
		int checkedIndex = -1;
		for (int i = 0; i < n - 1; i++) {
			int curCnt = 1;
			int curEnd = arr.get(i).end;
			if (i == 0) {
				for (int j = i + 1; j < n; j++) {
					if (curEnd <= arr.get(j).start) {
						if (checkedIndex == -1)
							checkedIndex = j;
						curEnd = arr.get(j).end;
						curCnt++;
					}
				}
			} else {
				for (int j = i + 1; j < checkedIndex; j++) {
					if (curEnd <= arr.get(j).start) {
						curEnd = arr.get(j).end;
						curCnt++;
					}
				}
			}
			cnt = Math.max(cnt, curCnt);
		}
		return cnt;
	}

	static class Meeting implements Comparable<Meeting> {
		int start;
		int end;

		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			if (this.end == o.end) {
				return this.start - o.start;
			}
			return this.end - o.end;
		}

	}

}

