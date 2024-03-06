package General_problems;
import java.util.*;

public class fibonacci_dynamic 
{
	static int c;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		c = 0; 
		System.out.println("Fibonacci series:");
		fibonacci_dynamic obj=new fibonacci_dynamic();
		obj.fib(n);
		System.out.println("The recursive funtion is called "+c+" times");
	}
	public void fib(int n)
	{
		c++;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(i==1)
			{
				a[i]=1;
			}
			else if(i==0)
			{
				a[i]=0;
			}
			else
			{
				a[i]=a[i-1]+a[i-2];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
