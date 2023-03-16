import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		
		t1.insert(149, "Anusha");
		t1.insert(167, "Kosala");
		t1.insert(047, "Dinusha");
		t1.insert(066, "Jayani");
		t1.insert(159, "Nimal");
		t1.insert(118, "Nishantha");
		t1.insert(195, "Anusha");
		t1.insert(034, "Avodya");
		t1.insert(105, "Bimali");
		t1.insert(133, "Sampath");
		
		
		System.out.println("In Order");
		t1.TraverseinOrder();
		
		System.out.println();
		System.out.println("Pre Order");
		t1.TraversepreOrder();
		
		System.out.println();
		System.out.println("Post Order");
		t1.TraversepostOrder();
		
		int value;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Employee Number : ");
		value = scanner.nextInt();
		
		t1.find(value);
		
		System.out.println();
		t1.deleteAll();
		
		System.out.println("After the Delete Method Calling");
	}

}
