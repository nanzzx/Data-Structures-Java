package General_problems;
import java.util.*;

public class max_product 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]*a[j]>max)
				{
					max=a[i]*a[j];
				}
			}
		}
		System.out.println("Maximum value of product is:"+max);
	}
}
