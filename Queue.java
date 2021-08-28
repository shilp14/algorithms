package test;

public class Queue{
	
	int front;
	int rear;
	int[] queueArr;
	public Queue(int k) {
		front=-1;
		rear=-1;
		queueArr=new int[k];
	}
	
	public void enqueue(int data) {
		if(rear==queueArr.length-1) {
			System.out.println("Queue is full");
		}
		else {
			rear=rear+1;
			queueArr[rear]=data;
			if(front==-1) {
				front=rear;
			}
			
		}
		
		
	}
	
	public boolean dequeue() {
		if(front==-1) {
			System.out.println("queue is empty");
			return false;
		}
		else {
			if(front==queueArr.length|| front==rear) {
				front=-1;
				rear=-1;
				return true;
			}
			front=front+1;
			
		}
		
		return true;
	}
	
	public   void print() {
		if(front!=-1 &&rear!=-1) {
		for(int i=front;i<=rear;i++) {
			System.out.println(queueArr[i]);
		}
		}
		else
			System.out.println("queue is empty");
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.print();
		q.enqueue(2);
		q.print();
		
	}

}
