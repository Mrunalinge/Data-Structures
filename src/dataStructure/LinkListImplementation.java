package dataStructure;

public class LinkListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SingleLinkList ll = new SingleLinkList();
//		ll.createSingleLinkedList(0);
//		ll.insertLinkedList(1, 1);
//		ll.insertLinkedList(2, 2);
//		ll.insertLinkedList(3, 3);
//		ll.insertLinkedList(4, 4);
//		ll.insertLinkedList(5, 5);
//		ll.traverseLinkedList();
//		ll.insertLinkedList(8, 3);
//		ll.traverseLinkedList();
		DoublyLinkedList dll= new DoublyLinkedList();
		dll.createDoubleLinkedList(0);
		dll.insertInDobleLinkedList(1, 1);
		dll.insertInDobleLinkedList(2, 2);
		dll.insertInDobleLinkedList(3, 3);
		dll.insertInDobleLinkedList(4, 4);
		dll.insertInDobleLinkedList(5, 5);
		dll.traverseLinkedList();
		dll.traverseLinkedListReverse();
		dll.insertInDobleLinkedList(7, 4);
		dll.traverseLinkedList();
		dll.deleteOneNode(4);
		dll.traverseLinkedList();
		dll.searchNode(3);
	}

}
