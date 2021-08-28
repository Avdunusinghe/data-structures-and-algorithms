package structures.tree.labsheet;

public class Tree {
	
	private Node root;
	
	public void insert(int employeeNumber, String name) {
		
		//create new Node
		Node newNode = new Node();
		//assign the employee number to the new node
		newNode.employeeNumber = employeeNumber;
		//assign the name to the new node
		newNode.name = name;
		
		//checking the tree is empty
		if(root == null) {
			
			//if the tree is empty make the new node as the root
			root = newNode;
		}
		else {
			
			Node current = root;
			Node parent;
			
			//allways the condtion is true
			while(true) {
				
				parent = current;
				
				//left
				if(employeeNumber< current.employeeNumber) {
					
					current = current.leftChild;
					
					if(current == null) {
						
						current.leftChild = newNode;
						return ;
					}
				}
				//right
				else {
					
					current = current.rigthChild;
					
					if(current == null) {
						
						parent.rigthChild = newNode;
						return;
					}
					
				}
			}
		}
		
	}
	
	//pattern left,root,rigth
	private void inOrder(Node localRoot) {
		
		if(localRoot != null) {
			
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.leftChild);	
		}
		else {
			
			System.out.println("The tree is empty");
		}
		
	}
	
	public void TraverseInOder() {
		
		inOrder(root);
	}
	
	//root,left,right
	private void preOrder(Node localRoot) {
		
		if(localRoot != null) {
			
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rigthChild);
		}
	}
	
	public void TraversePreOder() {
		
		preOrder(root);
	}
	
	//left,right,root
	private void postOrder(Node localRoot) {
		
		postOrder(localRoot.leftChild);
		postOrder(localRoot.rigthChild);
		localRoot.displayNode();
	}
}
