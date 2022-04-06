package doit_algo_boj.platinum._5;

import java.io.*;
import java.util.*;

public class 최솟값_찾기_11003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int L = Integer.parseInt(stk.nextToken());
		stk = new StringTokenizer(br.readLine());
		Deque<Node> deque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int cur = Integer.parseInt(stk.nextToken());
			while (!deque.isEmpty() && deque.getLast().value > cur) {
				deque.removeLast();
			}
			deque.addLast(new Node(i, cur));
			if (!deque.isEmpty() && deque.peek().index < i - L + 1) {
				deque.removeFirst();
			}

			if (!deque.isEmpty())
				bw.append(String.valueOf(deque.peek().value)).append(" ");
		}
		bw.flush();
		bw.close();
	}
}

class Node {
	int index;
	int value;

	public Node(int index, int value) {
		this.index = index;
		this.value = value;
	}
}
