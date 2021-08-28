package structures.tree.labsheet;

public class Node {
	
	public String name;
	public int employeeNumber;
	
	public Node leftChild;
	public Node rigthChild;
	
	public void displayNode() {
		
		System.out.println("Employee Number:" + employeeNumber + "Name" + name);
	}

}
