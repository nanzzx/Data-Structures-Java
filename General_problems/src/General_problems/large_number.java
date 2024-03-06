package General_problems;
import java.util.*;

public class large_number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		int i=0;
		int arr[]=new int[10];
		n=Math.abs(n);
		while(n!=0)
		{
			int a=n%10;
			n/=10;
			arr[i]=a;
			i++;
		}
		Arrays.sort(arr, 0, i);
		System.out.println("Largest number:");
		for(int x=i-1;x>=0;x--)
		{
			System.out.print(arr[x]);
		}
	}
}
