package problem.sec06.searching.p04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// my solution
// solution : arraylist
// solution2 : int array
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (Integer x : solution2(s, n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static List<Integer> solution(int s, int n, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (answer.contains(arr[i])) answer.remove(Integer.valueOf(arr[i]));
			answer.add(0, arr[i]);
			if (answer.size() > s) answer.remove(answer.size() - 1);
		}
		return answer;
	}

	private static int[] solution2(int s, int n, int[] arr) {
		int[] answer = new int[s];
		for (int i = 0; i < n; i++) {
			// answer 내에 있는 지 확인
			boolean flag = false;
			for (int j = 0; j < s; j++) {
				if (answer[j] == 0) break;
				if (answer[j] == arr[i]) {
					flag = true;
					for (int k = j; k > 0; k--) answer[k] = answer[k - 1];
					break;
				}
			}
			if (!flag) {
				for (int k = s - 1; k > 0; k--) answer[k] = answer[k - 1];
			}
			answer[0] = arr[i];
		}
		return answer;
	}
}
