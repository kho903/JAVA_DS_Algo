package programmers.lv01.K번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		int[][] commands = new int[][] {
			{2,5,3},
			{4,4,1},
			{1,7,3}
		};

		System.out.println(Arrays.toString(solution(new int[] {1, 5, 2, 6, 3, 7, 4}, commands)));
	}
	public static int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];
		int x = 0;
		for (int[] command : commands) {
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = command[0]; i <= command[1]; i++)
				arr.add(array[i - 1]);
			Collections.sort(arr);
			int a = command[2] - 1;
			answer[x++] = arr.get(a);
		}
		return answer;
	}
}
