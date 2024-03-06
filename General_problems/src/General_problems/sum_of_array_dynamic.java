package General_problems;
import java.util.*;

public class sum_of_array_dynamic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" element:");
			a[i]=sc.nextInt();
		}
		c=0;
		System.out.println("Sum of elements in array is: "+sum(a,n));
		System.out.println("The recursive funtion is called "+c+" times");
	}
	static int c;
	static int sum(int[] arr,int n)
	{
		c++;
		for(int i=1;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}
		return arr[n-1];
	}
}
