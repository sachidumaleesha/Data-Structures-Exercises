
public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insert(int emp, String name) {
		Node nw = new Node();
		
		nw.empID = emp;
		nw.name = name;
		
		if (root == null) {
			root = nw;
		}
		else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				
				if (emp < current.empID) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = nw;
						return;
					}
				}
				else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = nw;
						return;
					}
				}
			}
		}
	}
	
	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void TraverseinOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		if (localRoot == null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void TraversepreOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	public void TraversepostOrder() {
		postOrder(root);
	}
	
	private Node findRecursive(Node localRoot, int empNo) {
		if (localRoot == null) {
			return null;
		}
		
		else if (localRoot.empID == empNo) {
			System.out.println(localRoot.name);
			return localRoot;
		}
		
		else if (localRoot.empID == empNo) {
			return findRecursive(localRoot.leftChild, empNo);
		}
		
		else {
			return findRecursive(localRoot.rightChild, empNo);
		}
	}
	
	public Node find(int empNo) {
		Node current = null;
		
		while (current.empID != empNo) {
			if (empNo < current.empID) {
				current = current.leftChild;
			}
			else {
				current = current.rightChild;
			}
			
			if (current == null) {
				System.out.println("Error not Found");
				return null;
			}
			//found and print empNO
		}
		System.out.println("Employee Name : " + current.name);
		return current;
	}
	
	public void deleteAll() {
		root = null;
	}
	
	
}
