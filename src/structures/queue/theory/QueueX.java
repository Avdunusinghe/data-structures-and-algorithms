package structures.queue.theory;

public class QueueX {
	
	private int maxSize;
	private int queueArray[];
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX(int size) {
		
		this.maxSize = size;
		this.queueArray = new int[maxSize];	
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(int value) {
		
		//check whether queue is full
		if(rear == maxSize - 1) {
			
			System.out.println("Queue is full");
		}
		else {
			
			 queueArray[++rear] = value;
			 
			 nItems++;
		}
	}
	
	public int remove() {
		
		if(nItems == 0) {
			
			System.out.println("Queue is empty");
			
			return -99;
		}
		else {
			
			nItems--;
			
			return queueArray[front++];
		}
	}
	
	public int peekFront() {
		
			if(nItems == 0) {
			
			System.out.println("Queue is empty");
			
			return -99;
			
			}
			else {
				
				return queueArray[front];
			}
				
	}
	
	

}
