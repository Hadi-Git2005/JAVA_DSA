package LinkedList;
class Node2{
	int data;
	Node2 next;
	Node2 prev;
}
class Method2{
	static Node2 head;
	static Node2 last;
	public static void insertAtEnd2(int data)
	{
		Node2 newNode = new Node2();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null)
		{
			head = newNode;
			last = head;
			head.next = head;
			head.prev = head;
		}
		else
		{
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
			last.next = head;
		}
	}
	public static void middle2(int pos,int data)
	{
		Node2 newNode = new Node2();
		newNode.data = data;
		Node2 temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		newNode.prev = temp;
		temp.next.prev = newNode;
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public static void deleteAtEnd2()
	{
		Node2 temp = head;
		Node2 r = null;
		while(temp.next != null)
		{
			r = temp;
			temp = temp.next;
		}
		last = r;
		last.next = head;
	}
	public static void deleteAtMiddle2(int pos)
	{
		Node2 temp = head;
		for(int i=0;i<pos;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next; 
		temp.next.prev = temp;
	}
	public static void traverse2()
	{
		Node2  temp = head;
		do
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}while(temp!=head);
		System.out.println();
	}
	public static void rtraverse()
	{
		Node2  temp1 = last;
		do
		{
			System.out.print(temp1.data + " ");
			temp1 = temp1.prev;
		}while(temp1.prev!=last);
		System.out.println();
	}
}
public class CircularDoublyLinkedList extends Method2{
	public static void main(String[] args)
	{

//		
		insertAtEnd2(3);
		insertAtEnd2(4);
		traverse2();
		
		middle2(0,5);
		traverse2();
		
		
		deleteAtEnd2();
		traverse2();

		
//		deleteAtMiddle2(2);
//		traverse2();
		
	}
}
