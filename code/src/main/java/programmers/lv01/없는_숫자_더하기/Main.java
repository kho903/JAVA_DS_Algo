package programmers.lv01.없는_숫자_더하기;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] {1,2,3,4,6,7,8,0}));
		System.out.println(s.solution(new int[] {5,8,4,0,6,7,9}));
	}
}

class Solution {
	public int solution(int[] numbers) {
		int answer = 45;
		for (int x : numbers) {
			answer -= x;
		}
		return answer;
	}
}