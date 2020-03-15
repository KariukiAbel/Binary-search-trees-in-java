package com.nabesh;

public class Node {
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value <= data){
            if(left == null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else{
            if (right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if (value == data){
            return true;
        }else if (value < data){
             if (left == null){
                 return false;
             }else{
                 return left.contains(value);
             }
            }else {
            if (right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }

    public void printInOrderTraversal(){
        if (left != null){
            left.printInOrderTraversal();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrderTraversal();
        }
    }

    //In post order traversal the root node gets printed last and left node gets printed first
    public void printPostOrderTraversal(){
        if (left != null){
            left.printInOrderTraversal();
        }
        if (right != null){
            right.printInOrderTraversal();
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
	// write your code here
        Node node = new Node(8);
        node.insert(5);
        node.contains(3);
        node.printInOrderTraversal();
        node.printPostOrderTraversal();
    }
}
