import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<String>(5);
		A.add("a");
		A.add("b");
		A.add("c");
		A.add("d");
		A.add("e");
		A.get(0).equals("f");
		//System.out.print(A.get(0));
		Tree t = new Tree(8);

		Node n = new Node(15);
		t.meghdar(n, 10);
		t.meghdar(n, 20);
		t.meghdar(n, 8);
		t.meghdar(n, 12);
		t.meghdar(n, 16);
		t.meghdar(n, 25);

		t.inOrder(n);
		System.out.println();
		t.postOrder(n);
		System.out.println();
		t.preOrder(n);
		System.out.println();
	
		t.Successor(8);
		t.Successor(12);
		t.Successor(25);
		t.Predecessor(8);
		t.Predecessor(10);
		t.Predecessor(12);
		t.Predecessor(20);

	}

}
