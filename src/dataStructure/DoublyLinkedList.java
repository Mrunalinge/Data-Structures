package dataStructure;

public class DoublyLinkedList {
	
	public class Node{
		int value;
		Node next;
		Node prev;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
		public String toString(){
			return value +"";
			
		}
		
	}
	
	Node head, tail;
	int size;
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Node createDoubleLinkedList(int value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail=node;
		return head;

	}
	
	public void insertInDobleLinkedList(int value,int location) {
		
		Node node = new Node();
		node.setValue(value);
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			
		}else if(location ==0) {
			node.setNext(head);
			node.setPrev(null);
			head.setPrev(node);
            head = node;			
		}else if(location>=size) {
			node.setNext(null);
			tail.setNext(node);
			node.setPrev(tail);
			tail=node;
		}else {
			Node tempNode = head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			node.setPrev(tempNode);
			tempNode.setNext(node);
			node.getNext().setPrev(node);
		}
	    	setSize(getSize()+1);
		
	}
	
	public boolean existsLinkedList() {
		return head!=null;
	}
	
	public void traverseLinkedList() {
		if(existsLinkedList()) {
			Node temp = head;
			for(int i=0;i<size;i++) {
				System.out.print(temp.getValue());
				if(i!=size-1) {
					System.out.print(" -> ");
				}
				temp = temp.getNext();
			}
		}else {
			System.out.println("Linked list does not exist");
		}
		System.out.println("\n");
	}
	
	public void traverseLinkedListReverse() {
		if(existsLinkedList()) {
			Node temp =tail;
			for(int i=0;i<size;i++) {
				System.out.print(temp.getValue());
				if(i!=size-1) {
					System.out.print(" <- ");
					temp= temp.getPrev();
				}
			}
		}else {
			System.out.println("Linked list does not exist");
		}
		System.out.println("\n");
			
	}
	
	public void deleteDoubleLinkedList() {
		Node temp =head;
		System.out.println("Deleting list");
		for(int i=0;i<size;i++) {
			temp.setPrev(null);
			temp= temp.getNext();
		}
		head=null;
		tail=null;
		System.out.println("Linked list deleted successfully...");
	}
	
	public void deleteOneNode(int location) {
		
		if(existsLinkedList()) {
		 
		  if(location==0) {
			  if(getSize()==1) {
				  head=tail=null;
				  setSize(getSize()-1);
				  return;
			  }else {
			    head = head.getNext();
			    head.setPrev(null);
			    setSize(getSize()-1);
			  }
		   }else if(location>= size) {
			   Node temp = tail.getPrev();
			   if(temp == head) {
				   tail = head = null;
				   setSize(getSize()-1);
				   return;
			   }else {
			   
				   tail =temp;
				   tail.setNext(null);
				   setSize(getSize()-1);
			   }
		   }else {
			   Node temp = head;
			   for(int i=0;i<location-1;i++) {
				   temp=temp.getNext();
			   }
			   temp.setNext(temp.getNext().getNext());
			   temp.getNext().setPrev(temp);
			   setSize(getSize()-1);
		   }
		
		}
	}
	
	public boolean searchNode(int value) {
		
		if(existsLinkedList()) {
			Node tempNode = head;
			
			for(int i=0;i<size;i++) {
				if(tempNode.value==value) {
					System.out.println(value+" found at: "+i);
					return true;
				}
				tempNode= tempNode.getNext();
			}
		}
		System.out.println(value+" not found!");
		
		return false;
	}

}
