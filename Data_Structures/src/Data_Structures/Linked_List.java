package Data_Structures;
import java.util.*;

class Linked
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
 Node head,temp;
 void insert(int d)
 {
     Node n=new Node(d);
     if(head==null)
     {
    	 
     head=n;temp=n;
 }
 else
 {
     temp.next=n;
     temp=n;
 }
}
 //print
 void print()
 {
     Node t=head;
     while(t!=null)
     {
         System.out.println(t.data);
         t=t.next;
     }
 }
 //insert first
 void insertf(int d)
 {
     Node n=new Node(d);
     n.next=head;
     head=n;
 }
 //insert last
 void insertl(int d)
 {
     Node n=new Node(d);
      temp=head;
      while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=n;
 }
 //insert middle
 void insertm(int pos,int d)
 {
     Node n=new Node(d);
     temp=head;
     for(int i=0;i<pos-1;i++)
     {
         temp=temp.next;
     }
     n.next=temp.next;
     temp.next=n;
 }
 //delete first
  void delf()
  {
      head=head.next;
  }
  //delete last
  void dell()
  {
      head=temp;
      while(temp.next.next!=null)
      {
          temp=temp.next;
      }
      temp.next=null;
  }
  //delete in the mid
  void delm(int pos)
  {
     Node temp=head;
      for(int i=0;i<pos-1;i++)
      {
          temp=temp.next;
      }
      temp.next=temp.next.next;
  }
  //max of element
  void max()
  {
	  int max=0;
	  Node temp=head;
	  while(temp.next!=null)
	  {
		  if(temp.data>max)
		  {
			  max=temp.data;
		  }
		  temp=temp.next;
	  }
	  System.out.println(max);
  }
  //min of element
  void min()
  {
	  Node temp=head;
	  int min=temp.data;
	  while(temp.next!=null)
	  {
		  if(temp.data<min)
		  {
			  min=temp.data;
		  }
		  temp=temp.next;
	  }
	  System.out.println(min);
  }
  //find the element
  void find(int d)
  {
	  int n=d;
	  int pos=1;
	  Node temp=head;
	  while(temp.next!=null)
	  {
		  if(n==temp.data)
		  {
			  System.out.println(pos);
			  break;
		  }
		  else
		  {
			  pos++;
			  temp=temp.next;
		  }
	  }
	  if(n==temp.data&&temp.next==null)
	  {
		  System.out.println(pos);
	  }
  }
}
public class Linked_List{

 public static void main(String[] args)
     {
         Linked l=new Linked();
         for(int i=1;i<=5;i++)
         {
             l.insert(i);
         }
         l.print();
         System.out.println("Inserting the node in first");
         l.insertf(8);
         l.print();
         System.out.println("Inserting the node in last");
         l.insertl(9);
         l.print();
         System.out.println("Inserting the node in middle");
         l.insertm(2,8);
         l.print();
         System.out.println("after deleting first");
         l.delf();
         l.print();
         System.out.println("after deleting last");
         l.dell();
         l.print();
         System.out.println("after deleting mid");
         l.delm(3);
         l.print();
         System.out.println("Maximum value is:");
         l.max();
         System.out.println("Minimum value is:");
         l.min();
         System.out.println("Finding the value :");
         l.find(5);
     }
}