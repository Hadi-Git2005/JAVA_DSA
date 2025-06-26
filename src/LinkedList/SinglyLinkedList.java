package LinkedList;
class Node{
	int data;
	Node next;
}
class Method{
	static Node head;
	static Node last;
	public static void create(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
			last = head;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
	}
	public static void insertAtBegin(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null)
		{
			head = newNode;
			last = head;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	public static void middle(int pos,int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		Node temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public static void deleteAtBegin()
	{
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	public static void deleteAtEnd()
	{
		Node temp = head;
		Node r = null;
		while(temp.next != null)
		{
			r = temp;
			temp = temp.next;
		}
		r.next = null;
	}
	public static void deleteAtMiddle(int pos)
	{
		Node temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next; 
	}
	public static void traverse()
	{
		Node  temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
public class SinglyLinkedList extends Method{
	public static void main(String[] args)
	{
		insertAtBegin(1);
		insertAtBegin(2);
		traverse();
		create(3);
		create(4);
		traverse();
		middle(1,5);
		traverse();
		deleteAtBegin();
		traverse();
		deleteAtEnd();
		traverse();
		insertAtBegin(7);
		traverse();
		deleteAtMiddle(1);
		traverse();
	}
}
