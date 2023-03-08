package lab03;

public class LinkList {
	public Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Link cur = first;
		
		while(cur != null) {
			cur.displayDetails();
			cur = cur.next;
		}
	}
	
	public void insertFirst(String name, double avg) {
		Link newLink = new Link(name, avg);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	
	public boolean delete(String name) {
		Link cur = first;
		Link pre = first;
		
		while(cur != null) {
			if(cur.name == name) {
				if(cur == first) {
					first = first.next;
					return true;
				}
				else {
					pre.next = cur.next;
					return true;
				}
			}
			else {
				pre = cur;
				cur = cur.next;
			}	
		}
		return false;
	}

}
