package LinkedList;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node creatingSinglyLinkedList(int nodeValue) {   // take O(1) time for creating 
		head = new Node();            // take O(1) time
		Node node = new Node();       // take O(1) time
		node.next = null;             // take O(1) time
		node.data = nodeValue;	      // take O(1) time
		head = node;				  // take O(1) time
		tail = node;	              // take O(1) time
		size = 1;	   	 		 	  
		return head;
	}
      // Insert method singly linked list
	public void insertSinglyLinkedList(int value,int location) {
		Node node =new Node();
		node.data = value;
		if(head == null) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.creatingSinglyLinkedList(19);
		
		//Check the SinglyLinkedList created or not
		System.out.println(sLL.head.data);
	}

}

class Node {
	public int data;
	public Node next;
}