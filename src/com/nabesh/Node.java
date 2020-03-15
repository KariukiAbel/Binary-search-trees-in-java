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

    //In pre-order traversal the root node gets printed first followed by left then the right
    public void printPreOrderTraversal(){
        System.out.println(data);
        if (left != null){
            left.printPreOrderTraversal();
        }
        if (right != null){
            right.printPreOrderTraversal();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Node node = new Node(8);
        node.insert(5);
        node.insert(50);
        node.insert(7);
        node.insert(2);
        node.contains(3);
        node.printInOrderTraversal();
        System.out.println("Below shows the nodes in post order traversal");
        node.printPostOrderTraversal();
        System.out.println("Below shows the nodes in pre-order traversal");
        node.printPreOrderTraversal();
    }
}
