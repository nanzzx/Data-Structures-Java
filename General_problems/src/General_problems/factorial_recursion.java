package General_problems;
import java.util.*;

public class factorial_recursion 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		System.out.println("Factorial series:");
		c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(fact(i));
		}
		System.out.println("The recursive funtion is called "+c+" times");
	}
	static int c;
	static int fact(int n)
	{
		c++;
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}
