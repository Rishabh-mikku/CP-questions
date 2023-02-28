// Given a tree with elements stored in array as - {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}
// We have to display the level order traversal of a tree
// Output - 1 2 3 4 5 6

import java.util.*;
public class J56_BFS_tree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildTree{
        static int index = -1;

        public Node buildTree(int[] nodes){
            index++;

            if(nodes[index] == -1)
                return null;
            
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void levelOrderTraversal(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                System.out.print(root.data+" ");
                // q.remove(root);

                if(root.left != null)
                    q.add(root.left);
                
                if(root.right != null)
                    q.add(root.right);
                
                q.remove(root);
                root = q.peek();

            }
        }
    }
    public static void main(String[] arg){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        //printing level order traversal of a tree
        tree.levelOrderTraversal(root);
    }
}
