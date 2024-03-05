package Data_Structures;

import java.util.*;
import java.io.*;

public class two_stack_using_queue
{
	static Stack<Integer> stack1=new Stack<>();
	static Stack<Integer> stack2=new Stack<>();
	
	static void enqueue(int item)
	{
		stack1.push(item);
	}
	static void dequeue()
	{
		if(!stack2.isEmpty())
		{
			stack2.pop();
		}
		else if(!stack1.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			stack2.pop();
			return;
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
	static int front()
	{
		if(!stack2.isEmpty())
		{
			return stack2.peek();
		}
		else if(!stack1.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			return stack2.peek();
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		two_stack_using_queue s=new two_stack_using_queue();
		System.out.println("Enter your choice:\n1.Enqueue\n2.Dequeue\n3.Front");
		int t=sc.nextInt();
		while(t-->0)
		{
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter an element to the stack:");
				int x=sc.nextInt();
				enqueue(x);
				break;
			}
			case 2:
			{
				dequeue();
				break;
			}
			case 3:
			{
				System.out.println(front());
				break;
			}
			default:
			{
				break;
			}
			}
		}
	}
}
