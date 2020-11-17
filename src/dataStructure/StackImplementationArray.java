package dataStructure;

public class StackImplementationArray {
	
	int [] arr;
	int topOfStack;
	
	public StackImplementationArray(int size) {
		this.arr= new int[size];
		this.topOfStack =-1;
		System.out.println("Created an empty stack");
	}
	
	public void push(int value) {
		
		if(isFull()) {
			System.out.println("Stack overflow error! ");
		}
		else {
			arr[topOfStack+1]= value;
			topOfStack++;
			System.out.println("Successfully inserted "+value+ " in stack.");
		}
	}
	public void pop() {
		if(isEmpty()) System.out.println("Stack underflow error! ");
		else {
			System.out.println("Popping top of stack "+arr[topOfStack]);
			topOfStack--;
		}
	}
	
	public void peek() {
		if(isEmpty()) System.out.println("Stack is empty.");
		else System.out.println("Top of stack is: "+arr[topOfStack]);
	}
	
	public void deleteStack() {
		arr=null;
		System.out.println("Stack successfully deleted.");
	}
	public boolean isFull() {
		if(topOfStack==arr.length-1) {
			System.out.println("Stack is full");
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		if(topOfStack==-1) return true;
		
		return false;
	}
	

}
