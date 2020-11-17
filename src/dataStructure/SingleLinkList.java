package dataStructure;

public class SingleLinkList {
	
     class Node{
    	 
    	 int value;
    	 Node next;

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
    	 
		
	}
     
     
     Node head = null , tail = null;
     private int size;
     
     public Node createSingleLinkedList(int nodeValue) {
    	 
    	 head = new Node();
    	 Node node = new Node();
    	 node.setValue(nodeValue);
    	 node.setNext(null);
    	 head= node;
    	 tail=node;
    	 size=1;
    	 return head;
    	 
     }
     
     
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

	public void insertLinkedList(int nodeValue,int location) {
		Node node = new Node();
		node.setValue(nodeValue);
		
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			
		}else if(location==0) {
			node.setNext(head);
			head= node;
		}else if(location>=size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			Node tempNode = head;
			int index=0;
			
			while(index<location-1) {
				tempNode = tempNode.getNext();
				index++;
			}
			Node nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
			
		}
		setSize(getSize()+1);
		
	}
	
	public boolean existsLinkedList() {
		return head!=null;		
	}

     
     public void traverseLinkedList() {
  	 
    	 if(existsLinkedList()) {
    		 Node temp = head;
    		 for(int i=0;i<getSize();i++) {
    			 System.out.print(temp.getValue());
    			 if(i!= getSize()-1) {
    				 System.out.print("-> ");
    			 }
    		       temp= temp.getNext();	 
    		 }
    		 
    	 }else {
    		 System.out.println("Linked list does not exists");
    	 }
    	 System.out.println("\n");
     }
     
     public void deleteLinkedList() {
    	 System.out.println("Deleting linked list ");
    	 head= null;
    	 tail=null;
    	 System.out.println("Linked list deleted successfully");
     }
     
     public void deleteNode(int location) {
    	 
    	 if(!existsLinkedList()) {
    		 System.out.println("LInked list does not exist");
    	 }else if(location==0) {
    		 head= head.getNext();
    		 setSize(getSize()-1);
    		 if(getSize()==0) {
    			 tail=null;
    		 }
    	 }else if(location>= getSize()) {
    		 Node tempNode = head;
    		 for(int i=0;i<size-1;i++) {
    			 tempNode = tempNode.getNext();
    		 }
    		 if(tempNode==head) {
    			 tail=head=null;
    			 setSize(getSize()-1);
    			 return;
    		 }
    		 tempNode.setNext(null);
    		 tail= tempNode;
    		 setSize(getSize()-1);
    	 }else {
    		 Node temp =head;
    		 for(int i=0;i<location-1;i++) {
    			 temp=temp.getNext();
    		 }
    		 temp.setNext(temp.getNext().getNext());
    		 setSize(getSize()-1);
    	 }    	 
     }
     
     public boolean SearchNodes(int value) {
    	 if(existsLinkedList()) {
    		 Node temp = head;
    		 for(int i=0;i<getSize();i++) {
    			 if(temp.getValue() == value) {
    				 System.out.println("Found at location: "+i+"\n");
    				 return true;
    			 }
    			 temp=temp.getNext();
    		 }
    	 }
    	 System.out.println("Not found!");
    	 return false;
     }
    
}
