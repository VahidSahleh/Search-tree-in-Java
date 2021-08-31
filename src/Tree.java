import java.util.ArrayList;

public class Tree extends Node {

	Tree(int data) throws Exception {
		super(data);
		// TODO Auto-generated constructor stub
	}

	ArrayList<Integer> a = new ArrayList<>();

	public void inOrder(Node root) throws Exception {
		if (root == null) {

			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		a.add(root.data);
		inOrder(root.right);
		
	}

	public void preOrder(Node root) throws Exception {
		if (root == null) {

			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);

		preOrder(root.right);

	}

	public void postOrder(Node root) throws Exception {
		if (root == null) {

			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	
	}
	//to getting input for tree using Recursive
	public void meghdar(Node root, int data) throws Throwable {
		//put data in left node
		if (data < root.data) {
			if (root.left != null) {
				meghdar(root.left, data);
			} else {

				root.left = new Node(data);
			}

		}
		//put data in right node
		else {
			if (root.right != null) {
				meghdar(root.right, data);
			} else {
				root.right = new Node(data);
			}
		}
	}
	public void Successor(int n ) {
		a.add(null);
		for(int i=0; i<a.size(); i++) {
			try {
				if(n==a.get(i)) {
					
					
					if(a.get(i+1)==null) {
						System.out.println("the inorder successor of  "+n+" is "+" does not exist");
					}else {
						System.out.println("the inorder successor of  "+n+" is "+a.get(i+1));
					}
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			
		}
		
		
}
	public void Predecessor(int n ) {
		
		for(int i=0; i<a.size(); i++) {
			try {
				if(n==a.get(i)) {
					
					
					if(n==a.get(0)) {
						System.out.println("the inorder successor of  "+n+" is "+" does not exist");
					}else {
						System.out.println("the inorder successor of  "+n+" is "+a.get(i-1));
					}
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	}

