package problem.sec07.search.p09;

public class Main {
	static Node root;

	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		System.out.println(dfs(0, root));
	}

	private static int dfs(int L, Node root) {
		if (root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(dfs(L + 1, root.lt), dfs(L + 1, root.rt));
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