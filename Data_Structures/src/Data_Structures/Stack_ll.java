package Data_Structures;

class Node
{
	
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
	public Node () {
		// TODO Auto-generated method stub
		return;
	}
}
class LinkedList
{
	Node head;
	public void insertNode(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			new_node.next=head;
			head=new_node;
			return ;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
		return ;
	}
	public void enddel()
	{
		if(head==null)
		{
			System.out.println(-1);
			return;
		}
		Node temp=head; 
		if(temp.next==null)
		{
			System.out.println(temp.data);
			head=null;
			return;
		}
		while(temp.next.next!=null)
		{
			//System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.next.data);
		temp.next=null;
		//free(t);
		return;
	}
	public void top()
	{
		if(head==null)
		{
			System.out.println(-1);
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			//System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		//free(t);
		return;
	}
	public void size()
	{
		if(head==null)
		{
			System.out.println(0);
			return;
		}
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		System.out.println(c);
		//free(t);
	}
	boolean isempty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void print()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Stack_ll
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		for(int i=0;i<=10;i++)
		{
			l.insertNode(i);
		}
		l.print();
		System.out.println("isempty:"+l.isempty());
		System.out.print("Size:");
		l.size();
		System.out.println("Top:");
		l.top();
		System.out.println("Delete at end");
		l.enddel();
		System.out.println("After deleting");
		l.print();
	}
}