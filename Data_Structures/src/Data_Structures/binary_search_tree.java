package Data_Structures;

import java.util.*;

class bst_node
{
    bst_node left;
    bst_node right;
    int data;

    bst_node(int data)
    {
        this.data=data;
    }
}

class bst
{
    public bst_node insert(int data,bst_node root)
    {
        if(root==null)
        {
            bst_node newNode=new bst_node(data);
            return newNode;
        }
        if(root.data>=data)
        {
            root.left=insert(data,root.left);
        }
        else
        {
            root.right=insert(data,root.right);
        }
        return root;
    }
    public bst_node remove(int data,bst_node root)
    {
        if(root==null)
        {
            return null;
        }
        if(data<root.data)
        {
            root.left=remove(data,root.left);
            return root;
        }
        else if(data>root.data)
        {
            root.right=remove(data,root.right);
            return root;
        }
        else
        {
            if(root.left==null&&root.right==null)
            {
                return null;
            }
            else if(root.left==null)
            {
                return root.left;
            }
            else if(root.right==null)
            {
                return root.right;
            }
            else
            {
                bst_node minNode=root.right;
                while(minNode.left!=null)
                {
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right=remove(minNode.data,root.right);
                return root;
            }
        }
    }
    public void printTree(bst_node root) {
        if (root == null) 
        {
            return;
        }
        System.out.print(root.data+":");
        if (root.left != null)
        {
            System.out.print("L:"+root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print("R:"+root.right.data+",");
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public boolean search(int data,bst_node root)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==data)
        {
            return true;
        }
        else if(data>root.data)
        {
            return search(data,root.right);
        }
        else
        {
            return search(data,root.left);
        }
    }
}

public class binary_search_tree 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bst tree=new bst();
        bst_node root=null;
        int choice,input;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    input=sc.nextInt();
                    root=tree.insert(input, root);
                    break;
                case 2:
                    input=sc.nextInt();
                    root=tree.remove(input, root);
                    break;
                case 3:
                    input=sc.nextInt();
                    System.out.println(tree.search(input, root));
                    break;
                default:
                    tree.printTree(root);
                    break;
            }
        }
    }
}
//Output model
//7
//1 5
//1 3
//1 7
//3 5
//2 3
//3 5
//4
//Output
//true
//true
//5.L:3,
//R:7,
//
//3.
//7.
