package General_problems;
import java.util.*;

public class fibonacci_recursion 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		System.out.println("Fibonacci series:");
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i));
		}
		System.out.println("The recursive funtion is called "+c+" times");
	}
	static int c=0;
	static int fib(int n)
	{
		c++;
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
}
