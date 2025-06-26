package LinkedList;
class Node1{
	int data;
	Node1 next;
	Node1 prev;
}
class Method1{
	static Node1 head = null;
	static Node1 last = null;
	public static void insertAtEnd1(int data)
	{
		Node1 newNode = new Node1();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null)
		{
			head = newNode;
			last = head;
		}
		else
		{
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
	}
	public static void insertAtBegin1(int data)
	{
		Node1 newNode = new Node1();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		if(head == null)
		{
			head = newNode;
			last = head;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	public static void middle1(int pos,int data)
	{
		Node1 newNode = new Node1();
		newNode.data = data;
		Node1 temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		newNode.prev = temp;
		temp.next.prev = newNode;
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public static void deleteAtBegin1()
	{
		Node1 temp = head;
		head = head.next;
		temp.next = null;
		head.prev = null;
	}
	public static void deleteAtEnd1()
	{
		Node1 temp = head;
		Node1 r = null;
		while(temp.next != null)
		{
			r = temp;
			temp = temp.next;
		}
		last = r;
		r.next.prev = null;
		r.next = null;
	}
	public static void deleteAtMiddle1(int pos)
	{
		Node1 temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next; 
		temp.next.prev = temp;
	}
	public static void traverse1()
	{
		Node1  temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		Node1  temp1 = last;
		while(temp1!=null)
		{
			System.out.print(temp1.data + " ");
			temp1 = temp1.prev;
		}
		System.out.println();
	}
}

public class DoublyLinkedList extends Method1{
	public static void main(String[] args)
	{
		insertAtBegin1(1);
		insertAtBegin1(2);
		traverse1();
		insertAtEnd1(3);
		insertAtEnd1(4);
		traverse1();
		middle1(1,5);
		traverse1();
		deleteAtBegin1();
		traverse1();
		deleteAtEnd1();
		traverse1();
		insertAtBegin1(7);
		traverse1();
		deleteAtMiddle1(1);
		traverse1();
	}
}
