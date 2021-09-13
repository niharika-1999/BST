package com.bridgelabz.bst;

/*Binary Search Tree Program in which constructor
 * used to create new node 
 */

class Node
{
	int data;
	Node left_node;
	Node right_node;
	public Node(int item)
	{
		data=item;
		left_node=right_node=null;
				
	}
}

public class BinarySearchTree<T> {
	Node root;
	BinarySearchTree()
	{
		root=null;
	}
	void add(int key)
	{
		root=add(root,key);
	}
	
	Node add(Node root,int key) //add method used to check if tree is null should return new node or recur down
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key<root.data)
		{
			root.left_node=add(root.left_node,key);
		}
		else if(key>root.data)
		{
			root.right_node=add(root.right_node,key);
		}
		return root;
	}
	
	void inorder() //To display LinkedList
	{
		traverse(root);
	}
	
	void traverse(Node root) //inorder traversal of Binary Search Tree
	{
		if(root!=null)
		{
			traverse(root.left_node);
			System.out.println(root.data);
			traverse(root.right_node);
		}
	}
	
	public int size() //size method to check if all added in Binary tree
	{
		return this.sizeRecurse(root);
	}
	
	public int sizeRecurse(Node current)
	{
		return current==null?0:1+this.sizeRecurse(current.left_node)+this.sizeRecurse(current.right_node);
	}
	
	int search(int key)
	{
		search(root,key);
		if(search(root,key)!=null)
			return 1;
		return 0;
	}
	
	Node search(Node root,int key)
	{
		if(root==null) //To check root is null
		{
			return root;
		}
		else if(root.data==key) //To check key is present
		{
			return root;
		}
		if(root.data<key)
			return search(root.right_node,key);
		
		return search(root.left_node,key);
		
	}

}
