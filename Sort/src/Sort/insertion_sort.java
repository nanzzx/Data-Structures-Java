package Sort;
import java.util.*;

public class insertion_sort 
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
		insertion_sort obj=new insertion_sort();
		obj.insert(a,n);
	}
	public void insert(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println("Insertion Sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
   