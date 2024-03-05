package Data_Structures;

import java.util.Scanner;

public class catalan {
	public static long cata(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		long res=0;
		for(int i=0;i<n;i++)
		{
			res+=cata(i)*cata(n-i-1);
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print Catalan:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(cata(i)+" ");
		}
	}
}
//Also use (2n)!/n!(n+!)! formula