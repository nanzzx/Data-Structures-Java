package General_problems;
import java.util.*;

public class sum_of_n_dynamic 
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
	static int c;
	static int sum(int n)
	{
		c++;
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			arr[i]=arr[i-1]+i;
		}
		return arr[n];
	}
}
