package problem.sec03.slidingwindow.p03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution2(n, k, arr));
	}

	// my solution
	private static int solution(int n, int k, int[] arr) {
		int answer = 0;
		for (int i = 0; i < k; i++)
			answer += arr[i];
		int[] cur = new int[n - k + 1];
		cur[0] = 0;
		for (int i = k; i < n; i++) {
			cur[i - k + 1] = cur[i - k] + arr[i] - arr[i - k];
		}
		Arrays.sort(cur);
		return answer + cur[n - k];
	}

	// lecture
	private static int solution2(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		for (int i = 0; i < k; i++)
			sum += arr[i];
		answer = sum;
		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i - k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
}
