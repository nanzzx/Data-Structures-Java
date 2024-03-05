package General_problems;
import java.util.*;

public class special_characters 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'))
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
