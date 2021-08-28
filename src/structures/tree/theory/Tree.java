package structures.tree.theory;

public class Tree {
	
	private Node root;
	
	public Tree() {
		
		this.root = null;
	}
	
	public Node find(int key) {
		
		Node current = root;
		
		while(current.iData != key) {
			
			if(key<current.iData) {
				
				current = current.leftNode;
			}
			else {
				
				current = current.rigthNode;
				if(current == null) {
					
					return null;
				}
					
			}
		}
		return current;
		
		
	}
	
	public void insert(int id, double value) {
		
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = value;
		
		if(root == null) {
			
			root = newNode;
		
		}
		else {
			
			Node current = root;
			Node parent;
			while(true) {
				
				parent = current;
				
				if(id < current.iData) {
					current = current.leftNode;
					
					if(current == null) {
						
						current = current.leftNode = newNode;
						return;
					}
					
				}
				else {
					
					current = current.leftNode;
					if(current == null) {
						
						parent.rigthNode = newNode;
						return;
					}
				}
			}
		}
		
		
	}
	
}
