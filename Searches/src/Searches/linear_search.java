package Searches;
import java.util.*;

public class linear_search 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int x=sc.nextInt();
		System.out.println("Element is found at:");
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				System.out.print(i);
				return;
			}
		}
		System.out.print("-1");
	}
}
