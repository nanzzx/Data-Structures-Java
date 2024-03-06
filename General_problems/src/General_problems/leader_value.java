package General_problems;
import java.util.Scanner;

public class leader_value 
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
		sum(a,n);
	}
	public static void sum(int[] a,int n)
	{
		int add=0;
		if(n==0)
		{
			System.out.println("Array is empty");
			return;
		}
		System.out.println("Leader numbers:");
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					count++;
				}
			}
			if(count==(n-i-1))
			{
				System.out.println(a[i]);
				add+=a[i];
			}
		}
		System.out.println("Sum of leader numbers:"+(add+(a[n-1])));
	}
}
