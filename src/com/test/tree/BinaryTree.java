package com.test.tree;

public class BinaryTree {
        int value;
        Node root;

    public BinaryTree(int value) {
        this.value = value;
        root = new Node(value);
    }
    public BinaryTree() {
        root = null;
    }


    public static void main(String args[]) {
        BinaryTree t = new BinaryTree();
        t.root = new Node(5);
        t.add(13);
        t.add (10);
        t.add(4);
        t.add(3);
        t.add(6);

        System.out.println("Pre Order Traversal : ");
        t.preOrderTraversal();
        System.out.println("In Order Traversal : ");
        t.inOrderTraversal();
        System.out.println("Post Order Traversal : ");
        t.postOrderTraversal();

        System.out.println("");
        System.out.println("Finding a Key 10 : ");
        t.find(10);
        t.find(11);
    }

    private void find(int i) {
        find(root, i);
    }

    private void find (Node node, int i) {
        System.out.println("Attempt");
        Node current = node;
        if (current == null){
            System.out.println("Alas! Not found");
            return;
        }
        if (current.val == i) {
            System.out.println("Found");
        } else {
                if (i< current.val) {
                    current = current.left;
                    find(current, i);
                } else {
                    current = current.right;
                    find(current, i);
                }
        }
    }

    private void preOrderTraversal() {
        if (root == null) {
            System.out.println();
        }
        preOrderTraversal(root);
    }

    private void inOrderTraversal() {
        if (root == null) {
            System.out.println();
        }
        inOrderTraversal(root);
    }

    private void postOrderTraversal() {
        if (root == null) {
            System.out.println();
        }
        postOrderTraversal(root);
    }

    private void preOrderTraversal(Node currentNode) {
        if (currentNode != null) {
            preOrderTraversal(currentNode.left);
            System.out.print(currentNode.val+" ");
            preOrderTraversal(currentNode.right);
        }
    }

    private void inOrderTraversal(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.val+" ");
            inOrderTraversal(currentNode.left);
            inOrderTraversal(currentNode.right);
        }
    }

    private void postOrderTraversal(Node currentNode) {
        if (currentNode != null) {
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.print(currentNode.val+" ");
        }
    }

    public void add(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (val< parent.val) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new Node(val);
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = new Node(val);
                        return;
                    }
                }
            }
        }
    }


}
class Node
{
    int val;
    Node left, right;

    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}
