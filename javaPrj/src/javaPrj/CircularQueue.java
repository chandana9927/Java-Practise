package javaPrj;

public class CircularQueue {
	
	int queue[];
	int front, rear, size;
	
	public CircularQueue(int n) {
		
		size = n;
		queue = new int[size];
		front = -1;
		rear = -1;
		
	}
	
	public void enqueue(int value) throws QueueFullException{
		
		if((rear + 1) % size == front)
			
			throw new QueueFullException("Queue Overflow!!!");
		
		if(front == -1)
			
			front = 0;
		
		rear = (rear + 1) % size;
		queue[rear] = value;
		
		System.out.println("Inserted : " +value);
	}
	
public int dequeue() throws QueueEmptyException{
		
		if(front == -1)
			
			throw new QueueEmptyException("Queue Underflow!!!");
		
		int value = queue[front];
		
		if(front == rear) {
			
			front = rear = -1;
			
		}
		else {
			
			front = (front + 1) % size;
		}
		
		return value;
	}

	public void display() {
		
		if(front == -1) {
			
			System.out.println("Queue Empty");
			return;
		
		}
		
		int i = front;
		
		while(true) {
			
			System.out.println(queue[i] + " ");
			
			if(i == rear) 
				break;
				
			i = (i + 1) % size;
		}
		
		System.out.println();
	}
}
