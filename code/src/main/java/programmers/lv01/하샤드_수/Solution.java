package programmers.lv01.하샤드_수;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}

	public static boolean solution(int x) {
		int num = 0;
		int start = x;
		while (start > 0) {
			num += start % 10;
			start /= 10;
		}
		if (x % num == 0) return true;
		return false;
	}
}
