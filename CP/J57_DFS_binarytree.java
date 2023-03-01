// Given a tree with elements stored in array as - {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}
// We have to display the depth first traversal of a tree
// Output - 1 2 4 5 3 6

import java.util.*;
public class J57_DFS_binarytree {

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

    static class BinaryTree{
        static int index = -1;

        public Node buildTree(int[] nodes){
            index++;
            
            if(nodes[index] == -1)
                return null;
            
            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }

        public void dfs_BinaryTree(Node root){
            Stack<Node> st = new Stack<>();
            st.push(root);

            while(!st.isEmpty()){
                System.out.print(root.data+" ");
                // st.pop();
                
                //inserting right child of root node in stack if it is not null
                if(root.right != null)
                    st.push(root.right);
                
                //inserting left child of root node in stack if it is not null
                if(root.left != null)
                    st.push(root.left);

                root = st.peek();
                st.pop();
            }
        }
    }
    public static void main(String[] arg){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        //dfs in binary tree
        tree.dfs_BinaryTree(root);
    }
}
