package Data_Structures;
import java.util.*;


public class graph_adj_mat 
{
	public static boolean adjmat[][];
	private int numVer;
	public graph_adj_mat(int numVer)
	{
		this.numVer=numVer;
		adjmat=new boolean[numVer][numVer];
	}
	public void addedge(int i,int j)
	{
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		graph_adj_mat obj=new graph_adj_mat(n);
		System.out.println("Enter the edges(vertex oairs i and j):");
		for(int k=0;k<n;k++)
		{
			int i=sc.nextInt();
			int j=sc.nextInt();
			obj.addedge(i,j);
		}
		System.out.println("Adjacency Matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(adjmat[i][j]?"1":"0");
			}
			System.out.println();
		}
	}
}
//Output model
//4
//0 1
//1 2
//1 3
//3 0
//Output
//0100
//0010
//0001
//1000