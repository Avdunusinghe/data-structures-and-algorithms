package structures.queue.theory;

// This Implimetation  Circular Queue
public class QueueCircular {
	
	private int maxSize;
	private int queueArray[];
	private int front;
	private int rear;
	private int nItems;
	
	public QueueCircular(int size) {
		
		this.maxSize = size;
		this.queueArray = new int[maxSize];	
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void intert(int value) {
		
		if(nItems == maxSize) {
			
			System.out.println("Queue is Full");
		}
		else {
			
			if(rear == maxSize - 1) {
				
				rear = -1;
				
				queueArray[++rear] = value;
				
				nItems++;
			}
		}
	}
	
	public int remove() {
		
		
		if(nItems == 0) {
			
			System.out.println("Queue is empty");
		}
		else {
			
			int temp = queueArray[front++];
			
			if(front == maxSize) {
				
				front = 0;
				
				
			}
			
			nItems--;
			
			return temp;
			
			
		}
		return front;
	}
}
