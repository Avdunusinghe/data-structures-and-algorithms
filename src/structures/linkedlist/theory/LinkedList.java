package structures.linkedlist.theory;

public class LinkedList {
	
	private Link first;

	public LinkedList(Link next) {
		this.next = null;
	}
	
	public boolean isEmpty() {
		
		return(first == null);
	}
	
	public boolean find(int id) {
		
		Link current = first;
		
		while(current != null) {
			
			if(current.iData == id) {
				
				return true;
			}
			else {
				
				current = current.next;
			}
		}
		
		return false;
	}
	

}
