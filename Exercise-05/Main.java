package lab03;
public class Main {
	public static void main(String[] args) {
		/*Link Nipuna = new Link("Nipuna", 53.5);
		Link Aravinda = new Link("Aravinda", 78.0);
		Link Prashani = new Link("Prashani", 69.5);
		
		Nipuna.next = Aravinda;
		Aravinda.next = Prashani;
		Prashani.next = null;*/
		
		/*Nipuna.displayDetails();
		Aravinda.displayDetails();
		Prashani.displayDetails();*/
		
		LinkList l1 = new LinkList();
		
		l1.insertFirst("Nipuna", 53.5);
		l1.insertFirst("Aravinda", 78.5);
		l1.insertFirst("Prashani", 69.5);
		
		l1.delete("Nipuna");
		l1.delete("Aravinda");
		
		l1.displayList();
	}

}
