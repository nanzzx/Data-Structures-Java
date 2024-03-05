package General_problems;
import java.util.*;

public class no_of_mul 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int count=0;
		System.out.println("Multiples are:");
		for(int i=1;i<100;i++)
		{
			if(n % i == 0) 
            {
                int j = n / i; 
                if (i <= j)
                {
                    count++;
            		System.out.println(i+"*"+j);
                }
            }
		}
		System.out.println("No.of times: "+count);
	}
}
