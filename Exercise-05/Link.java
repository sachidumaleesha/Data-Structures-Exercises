package lab03;

public class Link {
	public String name;
	public double average;
	public Link next;
	
	public Link(String s, double avg) {
		name = s;
		average = avg;
		next = null;
	}
	
	public void displayDetails() {
		System.out.println("Name:\t"+name+" || Average:\t"+average);
		System.out.println("=====================================");
	}
	
}
