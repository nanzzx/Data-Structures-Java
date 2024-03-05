package Data_Structures;
import java.util.*;

public class SieveOfEratosthenes 
{
	static void sieveOfEratosthenes(int limit)
	{
		boolean[] isPrime=new boolean[limit+1];
		Arrays.fill(isPrime,true);
		for(int i=2;i*i<=limit;i++)
		{
			if(isPrime[i])
			{
				for(int j=i*i;j<=limit;j+=i)
				{
					isPrime[j]=false;
				}
			}
		}
		for(int i=2;i<=limit;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();
		sieveOfEratosthenes(limit);
	}
}
