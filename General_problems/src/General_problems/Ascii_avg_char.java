package General_problems;
import java.util.*;

public class Ascii_avg_char 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		ascii(s);
	}
	public static void ascii(String s)
	{
		int ascii=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			ascii=s.charAt(i);
			System.out.println(s.charAt(i)+"'s ASCII is "+ascii);
			sum+=ascii;
		}
		double avg=(double) sum / s.length();
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
		System.out.println("ASCII value: " + (char) avg);
	}
}
