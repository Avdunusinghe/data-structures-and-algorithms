package structures.linkedlist.labsheet;


public class LinkedList {
	
	private Link first;
	LinkedList() {
		
		this.first = null;
	}
	
	public boolean isEmpty() {
		
		return (first == null);
	}
	
	/*public int find(int id) {
		
		Link current = first;
		
		while(current != null) {
			
		     if(current.iData == id) {
		    	 
		    	 return id;
		     }
		     else {
		    	 
		    	 current = current.next;
		     }
		}
		return -99;
		
	}*/
	
	public void displayList() {
		
		Link current = first;
		
		while(current != null)
		{
			current.displayDeatils();
			
			current= current.next;
		}
	}
	
	public void insertFirst(String name,double avg) {
		
		Link newLink = new Link(name,avg);
		newLink.next = first;
		first = newLink;
		
		
	}
	
	/*public void insertMiddel(String name,double avg) {
		
			Link newLink = new Link(name,avg);
			
			Link current = first;
			
			while(current != null) {
				
				if(current.iData == key) {
					
					newLink.next = current.next;
					current.next = newLink;
				}
				else {
					current = current.next;
				}
			}
			
			
		}*/
	
	public Link deleteFirst(){
		Link temp = first;

		first = first.next;

		return temp;
	}
	
	public Link deleteLink(String name) {
		
		Link current = first;
		Link previous = first;
		
		while(current.name != name) {
			
			if(current.next == null) {
				
				return null;
			}
			else {
				
				previous = current;
				current = current.next;
						
			}
		}
		
		if(current == first) {
			first = current.next;
		}
		else {
			
			previous.next = current.next;
		}
		return current;
	}
	

}
