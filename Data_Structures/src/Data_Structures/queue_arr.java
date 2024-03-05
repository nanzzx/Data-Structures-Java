package Data_Structures;
import java.util.*;
class Solution
{
    int rear=-1;
    int front=-1;
    int max_size=100;
    int arr[]=new int[max_size];
    
    void enqueue(int ele)
    {
    	if(rear==max_size-1)
    	{
    		System.out.println("Queue is full");
    	}
    	else if(front==-1&&rear==-1)
    	{
    		front++;
    		rear++;
    		arr[rear]=ele;
    	}
    	else
    	{
    		arr[++rear]=ele;
    	}
    }
    void display()
    {
        if(front==0&&rear==0)
        {
            return;
        }
        else
        {
            for(int i=0;i<=rear;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
    void dequeue()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
        	front++;
        }
    }
    void maxi()
    {
    	int max=0;
    	for(int i=front;i<=rear;i++)
    	{
    		if(arr[i]>max)
    		{
    			max=arr[i];
    		}
    	}
    	System.out.println("Maximum:"+max);
    }
    void mini()
    {
    	int min=arr[front];
    	for(int i=front+1;i<=rear;i++)
    	{
    		if(arr[i]<min)
    		{
    			min=arr[i];
    		}
    	}
    	System.out.println("Minimum:"+min);
    }
    void peek()
    {
    	System.out.println("Peek:"+arr[front]);
    }
    boolean isempty()
    {
    	if(front==-1&&rear==-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    boolean isfull()
    {
    	if(rear==max_size-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
public class queue_arr
{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Solution q=new Solution();
        System.out.println("Enter the size of the queue:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            q.enqueue(x);
        }
//        System.out.println("Elements in queue:");
//        q.display();
//        q.dequeue();
//        System.out.println("Display after dequeue");
//        q.display();
//        q.maxi();
//        q.mini();
//        q.peek();
        System.out.println("isempty:"+q.isempty());
        System.out.println("isfull:"+q.isfull());
    }
}
