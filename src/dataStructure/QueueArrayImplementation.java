package dataStructure;

public class QueueArrayImplementation {
	
	int arr[];
	int topOfQueue;
	int beginingOfQueue;
	
	public QueueArrayImplementation(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginingOfQueue =-1;
		
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue overflow");
		}
		else if(isEmpty()) {
			beginingOfQueue =0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println(value+" inserted successfully");
		}else {
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println(value+" inserted successfully");
		}
		printQueue();
	}
	
	public void printQueue()
	{
		if(isEmpty()) System.out.println("Queue is empty");
		else {
			for(int i=beginingOfQueue;i<topOfQueue;i++)
			    System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void deQueue() {
		if(isEmpty()) System.out.println("Queue is empty");
		else {
			System.out.println("Dequeued: "+arr[beginingOfQueue]);
			beginingOfQueue++;
			if(beginingOfQueue>topOfQueue) beginingOfQueue = topOfQueue =-1;
			printQueue();
		}
	}
	
	
	public void peek() {
		if(isEmpty()) System.out.println("Queue is empty");
		else {
			System.out.println(arr[beginingOfQueue]);
		}
	}
	public boolean isEmpty() {
		
		if(beginingOfQueue == -1 || beginingOfQueue == arr.length) {
			return true;
		}
		return false;
	}
	
	public void deleteQueue() {
		arr=null;
		System.out.println("Queue is deleted");
	}
	public boolean isFull() {
		
		if(topOfQueue == arr.length-1) {
			return true;
		}
		return false;
	}

}
