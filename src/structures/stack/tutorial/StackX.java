package structures.stack.tutorial;

public class StackX {
	
	private int maxSize;
	
	private char stackArray[];
	
	private int top;
	
	public StackX(int maxSize) {
		
		this.maxSize = maxSize;
		
		this.stackArray = new char[maxSize];
		
		this.top = -1;
	}
	
	//insert item
		/*public void push(char value) {
			if(top == maxSize-1) {
				
				System.out.println("Stack is full");
			}
			else {
				
				stackArray[++top]=value;
			}
			
			
		}
		
		//delete value 
		public char pop() {
			
			if(top == -1) {
				
				return null;
			}
			else {
				
				return stackArray[--top];
			}
		}
		
		//display stack top value
		public char peek() {
			
			if(top == -1) {
				
				return 
			}
			else {
				
				return stackArray[top];
			}
		}*/
		
		
	
}
