package problem.sec07.search.p10;

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
		System.out.println(bfs(root));
	}

	private static int bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L = 0;
		while (!q.isEmpty()) {
			int length = q.size();
			for (int i = 0; i < length; i++) {
				Node cur = q.poll();
				if (cur.lt == null && cur.rt == null)
					return L;
				if (cur.lt != null) q.offer(cur.lt);
				if (cur.rt != null) q.offer(cur.rt);
			}
			L++;
		}
		return L;
	}
}

class Node {
	int data;
	Node lt, rt;

	public Node(int data) {
		this.data = data;
		lt = rt = null;
	}
}