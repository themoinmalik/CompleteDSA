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



//some question
//
//# Easy Level Binary Tree Interview Questions
//
//1. **Create a binary tree and print its elements in inorder traversal.**
//        2. **Find the height of a binary tree.**
//        3. **Count the number of nodes in a binary tree.**
//        4. **Print all leaf nodes of a binary tree.**
//        5. **Find the maximum value in a binary tree.**
//        6. **Check if a binary tree is empty.**
//        7. **Insert a node in a binary tree (at the first available position).**
//        8. **Print the sum of all nodes in a binary tree.**
//        9. **Search for a given value in a binary tree.**
//        10. **Print the preorder and postorder traversal of a binary tree.**



//
//# Medium Level Binary Tree Interview Questions
//
//1. **Find the diameter (longest path between any two nodes) of a binary tree.**
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
