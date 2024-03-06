package General_problems;
import java.util.Scanner;

public class power_dynamic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an value(a):");
		int a=sc.nextInt();
		System.out.println("Enter an power(n):");
		int n=sc.nextInt();
		c=0;
		System.out.println(a+"^"+n+"="+pow(a,n));
		System.out.println("The recursive funtion is called "+c+" times");
	}
	static int c;
	static int pow(int a,int n)
	{
		c++;
		int[] arr=new int[n+1];
		arr[0]=1;
		for(int i=1;i<=n;i++)
		{
			arr[i]=arr[i-1]*a;
		}
		return arr[n];
	}
}
