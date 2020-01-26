import java.util.Scanner;
public class boj1991_200126_KSH{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Tree t = new Tree();
		for(int i=0;i<N;i++) {
			char[] a = new char[3];
			a = sc.nextLine().replace(" ", "").toCharArray();
			t.add(a[0], a[1], a[2]);
		}
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
	}
}
class Node{
	char data;
	Node left, right;
	public Node(char data) {this.data=data;}
}
class Tree{
	Node root;
	public void add(char data,char left,char right) {
		if(root==null) {
			if(data!='.') root = new Node(data);
			if(left!='.') root.left = new Node(left);
			if(right!='.') root.right = new Node(right);
		}else search(root, data, left, right);
	}
	public void search(Node root,char data,char left, char right) {
		if(root==null) return;
		else if (root.data==data) {
			if(left!='.') root.left=new Node(left);
			if(right!='.') root.right=new Node(right);
		}else {
			search(root.left,data,left,right);
			search(root.right,data,left,right);
		}
	}
	
	public void preOrder(Node root) {
		System.out.print(root.data);
		if(root.left!=null)preOrder(root.left);
		if(root.right!=null)preOrder(root.right);
	}
	public void inOrder(Node root) {
		if(root.left!=null)inOrder(root.left);
		System.out.print(root.data);
		if(root.right!=null)inOrder(root.right);
	}
	public void postOrder(Node root) {
		if(root.left!=null)postOrder(root.left);
		if(root.right!=null)postOrder(root.right);
		System.out.print(root.data);
	}
}
