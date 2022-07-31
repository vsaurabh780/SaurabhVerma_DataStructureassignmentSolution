package com.bst.main;
class BST_class { 
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    } 
    Node root; 
    BST_class(){ 
        root = null; 
    } 
    Node delete_Recursive(Node root, int key)  { 
        if (root == null)  return root; 
        if (key < root.key)   
            root.left = delete_Recursive(root.left, key); 
        else if (key > root.key)  
            root.right = delete_Recursive(root.right, key); 
        else  { 
         
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
        } 
        return root; 
    } 
   
    int minValue(Node root)  { 
        int minval = root.key; 
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
    } 
   
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    Node insert_Recursive(Node root, int key) { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key)
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)  
            root.right = insert_Recursive(root.right, key); 
        return root; 
    } 
    void inorder() { 
        inorder_Recursive(root); 
    } 
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
}

