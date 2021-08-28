package structures.tree.theory;

public class Tree {
	
	private Node root;
	
	public Tree() {
		
		this.root = null;
	}
	
	public void inset(int id, double value) {
		
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
