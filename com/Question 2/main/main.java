package com.bst.main;
public class main {
	 public static void main(String[] args)  { 
	        BST_class bst = new BST_class(); 
	     
	        bst.insert(50); 
	        bst.insert(30); 
	        bst.insert(10); 
	        bst.insert(60); 
	        bst.insert(55); 
	     
	        System.out.println("The BST Created with input data(Left-root-right):"); 
	        bst.inorder(); 
	   
	 }
}