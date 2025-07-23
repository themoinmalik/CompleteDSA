package src.tree;



// Universal Binary Tree Template
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Inorder Traversal
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Add more methods here for other tree operations:
    // - findHeight(Node node)
    // - isBalanced(Node node)
    // - lowestCommonAncestor(Node root, Node p, Node q)
    // - serialize(Node root)
    // - deserialize(String data)




//# Easy Level Binary Tree Interview Questions
//
//        1. **Create a binary tree and print its elements in inorder traversal.**
//        2. **Find the height of a binary tree.**


//public  int height(Node root){
//
//    // null check...
//    if (root==null){
//        return 0;
//    }
//
//    int left = height(root.left);
//    int right = height(root.right);
//
//    return Math.max(left, right) + 1;
//
//
//}



//        3. **Count the number of nodes in a binary tree.**

//int count(Node node){
//
//    if (node == null){
//        return 0;
//    }
//    int left = count(node.left);
//    int right = count(node.right);
//
//    return  left+right+1;
//}


//        4. **Print all leaf nodes of a binary tree.**

    void allLeaf(Node node){

        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            System.out.println(node.data);
        }

        allLeaf(node.left);
        allLeaf(node.right);

    }


//        5. **Find the maximum value in a binary tree.**

    int maxValue(Node node){

        // null check..
        if (node == null){
            return Integer.MIN_VALUE;
        }

        int lmax = maxValue(node.left);
        int rmax = maxValue(node.right);

        return  Math.max(node.data, Math.max(lmax, rmax));

    }


//        6. **Check if a binary tree is empty.**

    boolean isEmpty(Node node) {

        return node == null;

    }


//        7. **Insert a node in a binary tree (at the first available position).**
//        8. **Print the sum of all nodes in a binary tree.**

    int sum(Node node){

        if (node == null){
            return 0;
        }

        return node.data + sum(node.left) + sum(node.right);
    }



//        9. **Search for a given value in a binary tree.**

    boolean givenValue(Node node, int key){

        if (node == null){
            return false;
        }

        if (node.data == key){
            return true;
        }

        boolean lans = givenValue(node.left, key);
        boolean rans = givenValue(node.right, key);

        return lans || rans;

    }



//
//public boolean search(Node node, int key) {
//    if (node == null)
//        return false;
//    if (node.value == key)
//        return true;
//    // Search in left and right subtrees
//    return search(node.left, key) || search(node.right, key);
//}

//        10. **Print the preorder and postorder traversal of a binary tree.**



//
//# Medium Level Binary Tree Interview Questions
//
//        1. **Find the diameter (longest path between any two nodes) of a binary tree.**


    int diameter(Node node){

      int[] maxDia = new int[]{0};
      calculateHeight(node, maxDia);
      return maxDia[0];

    }

    int calculateHeight(Node node, int[] maxdia){

        if (node == null){
            return 0;
        }

        int leftH = calculateHeight(node.left, maxdia);
        int rightH = calculateHeight(node.right, maxdia);

        maxdia[0] = Math.max(maxdia[0], leftH+rightH+1);

        return Math.max(leftH, rightH)+1;


    }






//        2. **Check if a binary tree is balanced (height-balanced).**




//        3. **Print all root-to-leaf paths in a binary tree.**
//        4. **Find the Lowest Common Ancestor (LCA) of two nodes in a binary tree.**
//        5. **Mirror or invert a binary tree.**
//        6. **Level order traversal (BFS) and zigzag level order traversal.**
//        7. **Print boundary nodes of a binary tree (boundary traversal).**
//        8. **Find the maximum path sum in a binary tree.**
//        9. **Construct a binary tree from inorder and preorder or postorder traversals.**
//        10. **Check if two binary trees are identical.**
//        11. **Find the sum of all nodes at a given level in a binary tree.**
//        12. **Convert a binary tree to a doubly linked list.**
//        13. **Find the kth smallest/largest node in a binary tree.**
//        14. **Check if a binary tree is a subtree of another tree.**
//        15. **Find ancestors of a given node in a binary tree.**
//
//        ---


//
//# Hard Level Binary Tree Interview Questions
//
//1. **Recover a binary search tree where two nodes are swapped by mistake.**
//        2. **Print vertical order traversal of a binary tree.**
//        3. **Flatten a binary tree to a linked list in-place.**
//        4. **Serialize and deserialize a binary tree (handle edge cases and optimize for space).**
//        5. **Find the maximum sum path between any two nodes in a binary tree (not necessarily root to leaf).**
//        6. **Binary tree to BST conversion (preserve structure).**
//        7. **Find all nodes at distance k from a target node in a binary tree.**
//        8. **Count the number of paths that sum to a given value in a binary tree.**
//        9. **Construct a binary tree from ancestor matrix.**
//        10. **Find the longest consecutive sequence in a binary tree.**
//        11. **Print the top view and bottom view of a binary tree.**
//        12. **Clone a binary tree with random pointers.**
//        13. **Check if a given tree is a subtree of another tree (optimized O(m+n) solution).**
//        14. **Find the minimum time to burn the entire binary tree starting from a target node.**
//        15. **Find the largest BST subtree in a binary tree.**
//
//
















    // Example usage
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);
        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
}

