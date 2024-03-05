package Data_Structures;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;


public class  bfs_traversal
{
    public static void bfsTraversal(int[][] graph,int v)
    {
    boolean[] visited=new boolean[v];
    Queue<Integer>q=new LinkedList<>();
    for(int i=0;i<v;i++)
    {
        if(!visited[i])
        {
            q.add(i);
            visited[i]=true;
        while(!q.isEmpty())
        {
            int currentver=q.poll();
            System.out.print(currentver+" ");
            for(int j=0;j<v;j++)
            {
                if(graph[currentver][j]==1 && !visited[j])
                {
                    q.add(j);
                    visited[j]=true;
                }
            }
         }
       }
    }
    System.out.println();
   }
    public static void main(String[] args)
    {
       
        Scanner sc= new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        int graph[][]=new int [V][V];
        for(int i=0;i<E;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
            graph[b][a]=1;
        }
        bfsTraversal(graph,V);
    }
}
//Output model
//4 4
//0 1
//0 2
//1 2
//2 3
//Output
//0 1 2 3
