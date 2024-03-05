package Data_Structures;
import java.util.*;

class sol
{
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node temp,head;
	void enqueue(int d)
	{
		Node n=new Node(d);
		if(head==null)
		{
			head=n;
			temp=n;
		}
		else
		{
			temp.next=n;
			temp=n;
		}
	}
	void display()
	{
		Node temp=head;
		if(head.next==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			while(temp.next!=null)
			{
				System.out.println(temp.data);	
				temp=temp.next;
			}
		}
	}
	void dequeue()
	{
		while(head.next!=null)
		{
			head=head.next;
			break;
		}
	}
	void maxi()
	{
		int max=0;
		temp=head;
		while(head.next!=null)
		{
			if(temp.data>max)
			{
				max=temp.data;
			}
		}
		System.out.println("Maximum:"+max);
	}
	void mini()
	{
		System.out.println("hey");
	}
}
public class queue_ll
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		sol s=new sol();
		s.enqueue(4);
		s.enqueue(6);
		s.enqueue(9);
		s.enqueue(7);
		s.enqueue(10);
		s.display();
		s.dequeue();
		System.out.println("Display after dequeue:");
		s.display();
		s.maxi();
		s.mini();
	}
}
