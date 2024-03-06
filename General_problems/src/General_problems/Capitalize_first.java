package General_problems;
import java.util.*;

class StringFormatter 
{  
	public static String capitalizeWord(String str)
	{  
		String words[]=str.split("\\s");  
		String capitalizeWord="";  
        for(String w:words)
        {  
        	String first=w.substring(0,1);  
        	String afterfirst=w.substring(1);  
        	capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        }  
    return capitalizeWord.trim();  
     }  
}  
public class Capitalize_first
{
	public static void main(String[] args)
	{
		StringFormatter obj=new StringFormatter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		System.out.println(obj.capitalizeWord(s));
	}
}