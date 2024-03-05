package General_problems;
import java.util.*;

public class odd_digit_numbers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0&&a[i]<10)
			{
				count++;
			}
		}
		System.out.println("Number :"+count);
	}
}
