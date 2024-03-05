package Searches;
import java.util.*;

public class bs_descending 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bs_descending obj=new bs_descending();
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+i+" :");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x=sc.nextInt();
        
        // Sorting the array in descending order
        for(int i=0;i<n-1;i++)
        {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
        
        // Printing sorted array
        System.out.println("Elements in array(Sorted): ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        // Binary search for the element x
        int index = obj.bs(a, x);
        if (index != -1) {
            System.out.println("\nElement found at index: " + index);
        } else {
            System.out.println("\nElement not found.");
        }
    }
    
    public int bs(int[] a, int x)
    {
        int left = 0;
        int right = a.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (a[mid] == x)
            {
                return mid;
            }
            else if (a[mid] < x)
            {
                right = mid - 1; // Search in the left half
            }
            else
            {
                left = mid + 1; // Search in the right half
            }
        }
        return -1; // Element not found
    }
}
