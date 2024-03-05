package Data_Structures;
import java.util.*;
import java.util.LinkedList;

class node1
	{
		int data;
		node1 left,right;
		
		node1(int x)
		{
			data=x;
			left=right=null;
		}
	}
public class binary_tree
{
	    static node1 head;
	    static int c=0;
		static int insert(Scanner sc)
		{
			Queue<node1> queue=new LinkedList<>();
			int x=sc.nextInt();
			if(x!=-1)
			{
				head=new node1(x);
				queue.add(head);
				c++;
			}
			while(!queue.isEmpty())
			{
				node1 temp=queue.poll();
				x=sc.nextInt();
				if(x!=-1)
				{
					temp.left=new node1(x);
					queue.add(temp.left);
				}
				int y=sc.nextInt();
				if(y!=-1)
				{
					temp.right=new node1(y);
					queue.add(temp.right);
				}
				c++;
			}
			return c;
		}
		static void inorder(node1 temp)
		{
			if(temp==null)
			{
				return;
			}
			inorder(temp.left);
			System.out.print(temp.data+" ");
			inorder(temp.right);
		}
		static void preorder(node1 temp)
		{
			if(temp==null)
			{
				return;
			}
			System.out.print(temp.data+" ");
			preorder(temp.left);
			preorder(temp.right);
		}
		static void postorder(node1 temp)
		{
			if(temp==null)
			{
				return;
			}
			preorder(temp.left);
			preorder(temp.right);
			System.out.print(temp.data+" ");
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Inserting into the tree:");
			int n=insert(sc);
			int l=(int)(Math.log(n)/Math.log(2));
			System.out.println("Diamter:"+(n-l-1));//diameter
			System.out.println("Inorder:");
			inorder(head);
			System.out.println("\nPreorder:");
			preorder(head);
			System.out.println("\nPostorder:");
			postorder(head); 
		}
		//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1 
}

