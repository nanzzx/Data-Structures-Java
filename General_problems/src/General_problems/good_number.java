package General_problems;
import java.util.*;

public class good_number 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+i+" :");
            a[i]=sc.nextInt();
        }
        good_number obj=new good_number();
        int num=obj.gn(a); // Corrected method invocation
        System.out.println("Number of Good numbers is: "+num);
    }
    
    public int gn(int[] a) // Changed the method signature to non-static
    {
        int count=0;
        for(int i=0;i<a.length;i++) // Iterate through the array a
        {
            for(int j=0;j<10;j++) // Check possible combinations of cubes
            {
                for(int k=0;k<10;k++)
                {
                    if(a[i] == Math.pow(j, 3) + Math.pow(k, 3)) // Check if the number is a good number
                    {
                        count++; // Increment the count of good numbers
                    }
                }
            }
        }   
        return count; // Return the count of good numbers
    }
}
