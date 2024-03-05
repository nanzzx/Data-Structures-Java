package Data_Structures;
import java.util.*;

public class graph_adj_list {
	 static void addedge(ArrayList<ArrayList<Integer>>al,int s,int d)
	    {
	        al.get(s).add(d);
	        al.get(d).add(s);
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc= new Scanner(System.in);
	        int v=sc.nextInt();
	        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
	        for(int i=0;i<v;i++)
	          al.add(new  ArrayList<>());
	         for(int j=0;j<v;j++)
	         {
	             int s=sc.nextInt();
	             int d=sc.nextInt();
	             addedge(al,s,d);
	         }
	         printGraph(al);
	    }
	    static void printGraph(ArrayList<ArrayList<Integer>>al)
	    {
	        for(int i=0;i<al.size();i++)
	        {
	            System.out.print("Vertex "+i+":");
	            for(int j=0;j<al.get(i).size();j++)
	           {
	               System.out.print(al.get(i).get(j)+" ");
	           }
	           System.out.println(" ");
	        }
	    }
}
//Output model
//5
//0 1
//0 2
//1 3
//2 4
//3 4
//Output
//Vertex 0:1 2  
//Vertex 1:0 3  
//Vertex 2:0 4  
//Vertex 3:1 4  
//Vertex 4:2 3  
