package General_problems;
import java.util.*;

public class factorial_dynamic
{
	static int c;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		c = 0; 
		System.out.println("Factorial series:");
		factorial_dynamic obj=new factorial_dynamic();
		obj.fact(n);
		System.out.println("The recursive funtion is called "+c+" times");
	}
	public void fact(int n)
	{
		c++;
		int a[]=new int[n+1];
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
				a[i]=i*a[i-1];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
