package dsa;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		if(first == null)
			return true;
		else
			return false;
	}
	
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.next;
		}
	}
	
	public void insertFirst(String name, double average) {
		Link newLink = new Link(name, average);
		
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		while(current != null) {
			if(current.name == name) {
				if(current == first)
					first = first.next;
				else
					previous.next = current.next;
				
				return current;
			}
			else {
				previous = current;
				current = current.next;
			}
		}
		//not found
		return null;
	}
}
