package problem.sec06.sort.p05;

import java.util.Arrays;
import java.util.Scanner;

// 정렬로 풀기
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, arr));
	}

	private static char solution(int n, int[] arr) {
		char answer = 'U';
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) return 'D';
		}
		return answer;
	}

}
