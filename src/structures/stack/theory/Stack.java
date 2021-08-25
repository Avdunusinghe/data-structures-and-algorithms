package structures.stack.theory;

public class Stack {
	
	private int maxSize; //size Of stack Array
	
	private double stackArray[];
	
	private int top; //top of the stack 
	
	public Stack(int size) {
	
		this.maxSize = size;
		
		this.stackArray = new double[maxSize];
		
		this.top = -1;
		
	}
	
	//insert item
	public void push(double value) {
		if(top == maxSize-1) {
			
			System.out.println("Stack is full");
		}
		else {
			
			stackArray[++top]=value;
		}
		
		
	}
	
	//delete value 
	public double pop() {
		
		if(top == -1) {
			
			return -99;
		}
		else {
			
			return stackArray[--top];
		}
	}
	
	
	
	

}
