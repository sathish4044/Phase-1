package phase1;
import java.util.LinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(6);
		list.add(2);
		list.add(9);
		System.out.println("Displaying data");
		list.display();
		System.out.println("Displaying data after removing 2nd index");
        list.remove(2);
        list.display();
        
	}

}
class Node{
	int data;
	Node address;
}
class MyLinkedList{
	Node head = null;
	Node tail = null;
	 public void add(int data) {
		 Node node = new Node();
		 node.data = data;
		 node.address = null;
	 
	 if (head == null) {
		 head = node;
		 tail = node;
	 }else {
		 tail.address = node;
		 tail = node;
	 }}
	 
	 public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		 Node temp = head;
		 temp = temp.address;
		 
		 }
	 
			 
	 
	 }
