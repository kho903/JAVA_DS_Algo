package programmers.lv02.행렬_테두리_회전하기;

import java.util.Arrays;

class Solution {
	public static int[] solution(int rows, int columns, int[][] queries) {
		int[][] arr = new int[rows + 1][columns + 1];
		int a = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				arr[i][j] = a++;
			}
		}

		if (queries.length == 1)
			return new int[] {arr[queries[0][0]][queries[0][1]]};

		int N = queries.length;
		int[] answer = new int[N];

		for (int i = 0; i < N; i++) {
			int curMin = Integer.MAX_VALUE;
			int[] top = {queries[i][0], queries[i][1], queries[i][0], queries[i][3]};
			int[] right = {queries[i][0], queries[i][3], queries[i][2], queries[i][3]};
			int[] bottom = {queries[i][2], queries[i][3], queries[i][2], queries[i][1]};
			int[] left = {queries[i][2], queries[i][1], queries[i][0], queries[i][1]};

			curMin = Math.min(curMin, arr[top[0]][top[1]]);
			int curValue = arr[top[0]][top[1]];
			for (int j = top[1] + 1; j <= top[3]; j++) {
				int tmp = curValue;
				curValue = arr[top[0]][j];
				arr[top[0]][j] = tmp;

				curMin = Math.min(curMin, arr[top[0]][j]);
			}

			for (int j = right[0] + 1; j <= right[2]; j++) {
				int tmp = curValue;
				curValue = arr[j][right[1]];
				arr[j][right[1]] = tmp;
				curMin = Math.min(curMin, arr[j][right[1]]);
			}

			for (int j = bottom[1] - 1; j >= bottom[3]; j--) {
				int tmp = curValue;
				curValue = arr[bottom[0]][j];
				arr[bottom[0]][j] = tmp;
				curMin = Math.min(curMin, arr[bottom[0]][j]);
			}

			for (int j = left[0] - 1; j >= left[2]; j--) {
				int tmp = curValue;
				curValue = arr[j][left[1]];
				arr[j][left[1]] = tmp;
				curMin = Math.min(curMin, arr[j][left[1]]);

			}
			answer[i] = curMin;

		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(
			Arrays.toString(solution(6, 6, new int[][] {
				{2,2,5,4}, {3,3,6,6}, {5,1,6,3}
			}))
		);
		System.out.println(
			Arrays.toString(solution(3, 3, new int[][] {
				{1,1,2,2}, {1,2,2,3}, {2,1,3,2}, {2,2,3,3}
			}))
		);
		System.out.println(
			Arrays.toString(solution(100, 97, new int[][] {
				{1,1,100,97}
			}))
		);
	}
}