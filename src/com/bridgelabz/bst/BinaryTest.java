package com.bridgelabz.bst;

public class BinaryTest {
	
	public static void main(String[] args) //MainMethod
	{
		BinarySearchTree node=new BinarySearchTree();
		node.add(56);
		node.add(70);
		node.add(30);
		node.add(22);
		node.add(40);
		node.add(11);
		node.add(3);
		node.add(16);
		node.add(60);
		node.add(95);
		node.add(65);
		node.add(63);
		node.add(67);
		System.out.println("Size of Binary Search Tree is :" + node.size());
		node.inorder();
	}

}
