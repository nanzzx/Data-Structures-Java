package Data_Structures;
import java.util.Scanner;

public class Stack_arr {
	int max_size=100;
	int arr[]=new int[max_size];
	int top;
	Stack_arr()
	{
		top=-1;
	}
	void push(int ele)
	{
		if(top==max_size-1)
		{
			System.out.println("Stack is full");
		}
		arr[++top]=ele;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			top--;
		}
	}
	boolean isempty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isfull()
	{
		if(top==max_size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	int top()
	{
		if(top==1)
		{
			return -1;
		}
		else
		{
			return arr[top];
		}
	}
	void print()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void maxi()
	{
		int max=0;
		for(int i=0;i<max_size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max:"+max);
	}
	void mini()
	{
		int min=top;
		for(int i=0;i<top;i++)
		{
			if(arr[i]<min)
			{ 
				min=arr[i];
			}
		}
		System.out.println("Min:"+min);
	}
	public static void main(String[] args)
	{
		Stack_arr s=new Stack_arr();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			s.push(i);
		}
		s.print();
		System.out.println("POPPING");
		s.pop();
		s.pop();
		s.print();
		System.out.println("PUSHING");
		s.push(99);
		
		System.out.println("isempty:"+s.isempty());
		System.out.println("isfull:"+s.isfull());
		s.print();
		System.out.println("top:"+s.top());
		s.maxi();
		s.mini();
		sc.close();
	}
}