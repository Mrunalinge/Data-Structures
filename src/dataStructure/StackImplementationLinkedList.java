package dataStructure;
import dataStructure.SingleLinkList;

public class StackImplementationLinkedList {
	
	SingleLinkList list;
	
	public StackImplementationLinkedList() {
		list = new SingleLinkList();
	}
	
	public void push(int value) {
		if(list.getHead()==null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertLinkedList(value, 0);
		}
		System.out.println("Insserted "+value+" in stack");
	}
	
	public int pop() {
		int value =-1;
		if(isEmpty()) System.out.println("Stack underflow error.");
		else {
			value = list.getHead().getValue();
			list.deleteNode(0);
			System.out.println("Top of stack is: "+value);
		}
		
		return value;
	}
	
	public int peek() {
		
		int value =-1;
		if(isEmpty()) System.out.println("Stack underflow error.");
		else {
			value = list.getHead().getValue();
			System.out.println("Top of stack is: "+value);
		}
		
		return value;
		
	}
	
	public void deleteStack() {
		list.setHead(null);
	}
	
	public boolean isEmpty() {
		if(list.getHead()==null) return true;
		else return false;
	}
	

}
