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
			System.out.println("Enter element "+i+" :");
			a[i]=sc.nextInt();
		}
		bubble_sort obj=new bubble_sort();
		obj.bs(a,n);
	}
	public int bs(int[] a,int n)
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
		System.out.print("Bubble Sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		return 1;
	}
}
