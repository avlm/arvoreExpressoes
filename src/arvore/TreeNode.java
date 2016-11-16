package arvore;

public class TreeNode {
	
	private char info;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(char info) {
		setInfo(info);
	}
	
	public char getInfo() {
		return info;
	}
	
	public void setInfo(char info) {
		this.info = info;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}
