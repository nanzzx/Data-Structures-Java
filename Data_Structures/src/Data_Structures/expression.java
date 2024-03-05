package Data_Structures;
import java.util.*;

public class expression
{
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        Stack<Character>st= new Stack<>();
	        int n=s.length();
	        int x=0;
	        for(int i=0;i<n;i++)
	        {
	            char c=s.charAt(i); 
	            if(c=='(')
	            {
	              st.push('(');  
	            }
	            else
	            {
	                st.pop();
	            }
	        }
	        if(st.isEmpty()) 
	        {
	          System.out.println("true");
	        }
	        else
	        {
	            System.out.println("false");
	        }
	    }
}