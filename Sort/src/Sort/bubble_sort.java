package Sort;
import java.util.*;

public class bubble_sort 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+i+" :");
			a[i]=sc.nextInt();
		}
		bubble_sort obj=new bubble_sort();
		obj.bs_ascending(a,n);
		System.out.println();
		obj.bs_descending(a,n);
	}
	public int bs_ascending(int[] a,int n)
	{
		int temp=0,flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.print("Bubble Sorted array(Ascending): ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		return 1;
	}
	public int bs_descending(int[] a,int n)
	{
		int temp=0,flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.print("Bubble Sorted array(Descending): ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		return 1;
	}
}
