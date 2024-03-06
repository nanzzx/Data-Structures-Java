package General_problems;
import java.util.*;

public class sum_of_n_recursion 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an range(n):");
		int n=sc.nextInt();
		c=0;
		System.out.println("Sum of first "+n+" natural number is: "+sum(n));
		System.out.println("The recursive funtion is called "+c+" times");
	}
	static int c,add=0;
	static int sum(int n)
	{
		c++;
		for(int i=0;i<=n;i++)
		{
			add+=i;
		}
		return add;
	}
}
