package structures.linkedlist.labsheet;

public class Link {
	
	public String name;
	public double average;
	
	public Link next;

	public Link(String name, double average) {
		
		this.name = name;
		this.average = average;
		this.next = null;
	}
	
	public void displayDeatils() {
		
		System.out.println(name +' '+ average);
	}
	
	

}
