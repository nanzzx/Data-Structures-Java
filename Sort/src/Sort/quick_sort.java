package Sort;
import java.util.*;

public class quick_sort 
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
		int lb=0,ub=n-1;
		quick_sort obj=new quick_sort();
		obj.quick(a,lb,ub);
		System.out.println("Selection sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void quick(int[] a,int lb,int ub)
	{
		if(lb<ub)
		{
			int loc=partition(a,lb,ub);
			quick(a,lb,loc-1);
			quick(a,loc+1,ub);
		}
			
	}
	public static int partition(int[] a, int lb, int ub) 
	{
		int pivot=a[lb];
		int start=lb,end=ub;
		while(start<end)
		{
			while(a[start]<=pivot&&start<ub)
			{
				start++;
			}
			while(a[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				swap(a,start,end);
			}
		}
		swap(a,lb,end);
		return end;
	}
	static void swap(int[] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
