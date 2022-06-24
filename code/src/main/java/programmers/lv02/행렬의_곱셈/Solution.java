package programmers.lv02.행렬의_곱셈;

import java.util.Arrays;

public class Solution {

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				int c = 0;
				while (c < arr1[0].length) {
					answer[i][j] += arr1[i][c] * arr2[c][j];
					c++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] s1 = solution(
			new int[][] {
				{1, 4}, {3, 2}, {4, 1}
			},
			new int[][] {
				{3, 3}, {3, 3}
			}
		);
		for (int[] s : s1) {
			System.out.println(Arrays.toString(s));
		}


		int[][] s2 = solution(
			new int[][] {
				{2,3,2},
				{4,2,4},
				{3,1,4}
			},
			new int[][] {
				{5,4,3},
				{2,4,1},
				{3,1,1}
			}
		);
		for (int[] s : s2) {
			System.out.println(Arrays.toString(s));
		}
	}
}
