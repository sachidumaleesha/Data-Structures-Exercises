
public class Node {
	public int empID;
	public String name;
	public Node leftChild;
	public Node rightChild;
	
	public void displayNode() {
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + empID);
	}
}