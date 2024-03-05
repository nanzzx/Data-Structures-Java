package Searches;
import java.util.*;

public class binary_search 
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
		System.out.println("Enter the element to search:");
		int x=sc.nextInt();
		int index=bs(a,x);
		System.out.println("Element found at index: "+index);
	}
	public static int bs(int[] arr,int target)
	{
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==target)
			{
				return mid;//target found at mid
			}
			else if(arr[mid]<target)
			{
				left=mid+1;//target is searched in right half
			}
			else
			{
				right=mid-1;//target is searched in left half
			}
		}
		return -1;
	}
}
