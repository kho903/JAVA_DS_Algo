package problem.sec04_hash.p03;

import java.util.ArrayList;
import java.util.HashMap;
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
		for (int x : solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

	private static ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
		}
		answer.add(map.size());
		for (int i = k; i < n; i++) {
			Integer firstValue = map.get(arr[i - k]);
			if (firstValue == 1) map.remove(arr[i - k]);
			else map.put(arr[i - k], firstValue - 1);
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			answer.add(map.size());
		}

		return answer;
	}
}
