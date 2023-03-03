public class J58_heightBinaryTree{

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

        public int heightTree(Node root){

            if(root == null)
                return 0;
            
            int leftnode = heightTree(root.left);
            int rightnode = heightTree(root.right);
            int height = Math.max(leftnode, rightnode) + 1;

            return height;
        }
    }
    public static void main(String[] arg){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        //printing height of a tree
        System.out.println("Height of a Tree: "+tree.heightTree(root));
    }
}