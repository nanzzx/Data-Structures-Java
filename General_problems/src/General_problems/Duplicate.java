package General_problems;
import java.util.*;

public class Duplicate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)&&i!=j)
				{
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
