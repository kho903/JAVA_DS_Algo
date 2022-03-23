package problem.sec07.search.p07;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static Node root;

	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		bfs(root);
	}

	public static void bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while (!q.isEmpty()) {
			int len = q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node cur = q.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null) q.offer(cur.lt);
				if (cur.rt != null) q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
}

class Node {
	int data;
	Node lt, rt;

	public Node(int val) {
		this.data = val;
		lt = rt = null;
	}
}