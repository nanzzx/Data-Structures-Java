package General_problems;
import java.util.*;

public class mini_missing_char 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        boolean[] present = new boolean[26];
        for (char c : s.toCharArray()) 
        {
            if (c >= 'a' && c <= 'z')
            {
                present[c - 'a'] = true;
            }
        }
        char missingChar = 'a';
        while (missingChar <= 'z' && present[missingChar - 'a']) 
        {
            missingChar++;
        }
        System.out.println("Minimum missing character: " + missingChar);
    }
}



//Input 
//abxsurf
//Output
//c

//Input 
//bxsurf
//Output
//a