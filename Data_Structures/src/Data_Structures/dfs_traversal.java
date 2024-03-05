package Data_Structures;
import java.util.*;

public class dfs_traversal 
{
    public static void dfs(int[][] graph,int v)
    {
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                dfs1(graph,i, visited); 
            }
        }
        System.out.println();
    }
    public static void dfs1(int[][] graph,int current,boolean[] visited)
    {
        visited[current]=true;
        System.out.print(current+" ");
        for(int i=0;i<graph[current].length;i++)
        {
            if(graph[current][i]==1&&!visited[i])
            {
                dfs1(graph,i,visited);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int[][] graph=new int[v][v];
        for(int i=0;i<e;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
            graph[b][a]=1;
        }
        dfs(graph,v);
    }
}

//Output method
//4 4
//0 1
//0 2
//1 2
//2 3
//Output
//0 1 2 3 