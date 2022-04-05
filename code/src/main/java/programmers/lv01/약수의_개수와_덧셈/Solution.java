package programmers.lv01.약수의_개수와_덧셈;

public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int count = func(i);
			if (count % 2 == 0) answer += i;
			else answer -= i;
		}
		return answer;
	}

	public static int func(int a) {
		if (a == 1) return 1;
		int count = 2;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) count++;
		}
		return count;
	}
}
