package programmers.lv01.소수_만들기;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4}));
		System.out.println(solution(new int[]{1,2,7,6,4}));
	}

	public static int solution(int[] nums) {
		int answer = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
				}
			}
		}
		return answer;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
