package dsa;

public class LinkListApp {
	public static void main(String[] args) {
//		Link l1 = new Link("Nipuna", 53.5);
//		Link l2 = new Link("Aravinda", 78.0);
//		Link l3 = new Link("Prashani", 69.5);
//		
//		l1.next = l2;
//		l2.next = l3;
//		
//		l1.displayDetails();
//		
//		System.out.println();
//		System.out.println();
//		
//		l2.displayDetails();
//		
//		System.out.println();
//		System.out.println();
//		
//		l3.displayDetails();
		
		LinkList list1 = new LinkList();
		
		list1.insertFirst("Nipuna", 53.5);
		list1.insertFirst("Aravinda", 78.0);
		list1.insertFirst("Prashani", 69.5);
		
		list1.displayList();
		System.out.println("********\n");
		
		list1.deleteLink("Aravinda");
		
		list1.displayList();
	}
}
