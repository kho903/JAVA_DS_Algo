package problem.sec05.stack.p03;

import java.util.Scanner;
import java.util.Stack;

// my solution
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = sc.nextInt() - 1;
		}
		System.out.println(solution(n, board, moves));
	}

	private static int solution(int n, int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int move : moves) {
			for (int i = 0; i < n; i++) {
				if (board[i][move] != 0) {
					if (!stack.isEmpty() && stack.peek() == board[i][move]){
						answer += 2;
						stack.pop();
					}
					else stack.push(board[i][move]);
					board[i][move] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
