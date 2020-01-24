package dsa;

public class LinkApp {
	public static void main(String[] args) {
		Link l1 = new Link("Nipuna", 53.5);
		Link l2 = new Link("Aravinda", 78.0);
		Link l3 = new Link("Prashani", 69.5);
		
		l1.next = l2;
		l2.next = l3;
		
		LinkList list = new LinkList();
		
		list.insertFirst("Nipuna");
		list.insertFirst("Aravinda");
		list.insertFirst("Prashani");

		list.insertFirst("Tharinda");
		list.insertFirst("Nuvindu");
		
		System.out.println(list.deleteFirst("Aravinda"));
	}
}
