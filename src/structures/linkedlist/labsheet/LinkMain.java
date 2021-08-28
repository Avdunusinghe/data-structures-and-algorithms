package structures.linkedlist.labsheet;

public class LinkMain {

	public static void main(String[] args) {
		
		Link l1 = new Link("Nipuna",53.5);
		Link l2 = new Link("Aravinada",78.0);
		Link l3 = new Link("Prashani",69.5);
		
		l1.next = l2;
		l2.next=l3;
		l3.next = null;
		
		l1.next.next.displayDeatils();
		l1.next.displayDeatils();
		
		LinkedList thelist = new LinkedList();
		
		thelist.insertFirst("Nipuna", 53.5);
		thelist.insertFirst("Aravinada", 78.0);
		thelist.insertFirst("Prashani", 69.5);
		
		thelist.displayList();

	}

}
