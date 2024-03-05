package Data_Structures;
import java.util.*;

public class npr_ncr 
{
	int fact(int number)
	{
		int i=1;
		int f=1;
		for(i=1; i<=number; i++)
		{
			f=f*i;
		}
		return f;
	}
	int combination(int n,int r)
	{
		int comb = fact(n) / (fact(r) * fact(n - r));
		return comb;
	}
	int permutation(int n,int r)
	{
		int perm = fact(n) / fact(n - r);
		return perm;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		npr_ncr obj=new npr_ncr();
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("Enter the value of r:");
		int r=sc.nextInt(); 
		if(n>=r)
		{
			System.out.println("Permutation:"+obj.permutation(n,r));
			System.out.println("Combination:"+obj.combination(n,r));
		}
		else
		{
			System.out.println("Invalid input values");
		}
		sc.close();
	}
}
