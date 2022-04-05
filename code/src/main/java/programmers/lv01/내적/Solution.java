package programmers.lv01.내적;

public class Solution {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {-3,-1,0,2};
		System.out.println(solution(a, b));
		a = new int[] {-1,0,1};
		b = new int[] {1,0,-1};
		System.out.println(solution(a, b));

	}

	public static int solution(int[] a, int[] b) {
		int answer = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
}
