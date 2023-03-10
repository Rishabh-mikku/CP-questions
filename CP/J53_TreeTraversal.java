//Program to traverse preorder, inorder and postorder in a Binary Tree

public class J53_TreeTraversal {

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
        static int idx = -1;

        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1)
                return null;
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preOrder(Node root){
            if(root == null)
                return;
            
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root == null)
                return;
            
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root == null)
                return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] arg){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data+" ");

        //preorder traversal
        tree.preOrder(root);
        System.out.println();

        //inorder traversal
        tree.inOrder(root);
        System.out.println();

        //postorder traversal
        tree.postOrder(root);
        
    }
}
