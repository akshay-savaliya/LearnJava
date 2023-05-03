package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BinaryTree {

        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


//    preorder ---> DFS Traversal ---> Time Complexity : O(n)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

//    inorder ---> DFS Traversal ---> Time Complexity : O(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

//    postorder ---> DFS Traversal ---> Time Complexity : O(n)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

//    level order ---> BFS Traversal ---> Time Complexity : O()
//    implement using queue
//    for print next line ---> store null in queue
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

//    Time Complexity : O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

//    Time Complexity : O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

//    Time Complexity : O(n)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;

    }

//    Diameter of a Tree ---> Number of Nodes in the Longest path between any 2 nodes.

//    Approach 1 : O(n^2)

//    Every Node have 3 cases ---> out of 3 cases Max is selected.
//    -> Diameter lies on left subtree
//    -> Diameter lies on right subtree
//    -> Diameter pass through root Node ---> LeftHeight + RightHeight + 1

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(Math.max(dia1, dia2), dia3);
    }

//    Approach 2 : O(n)

    static class TreeInfo {
        int h;
        int diam;

        TreeInfo(int h, int diam) {
            this.h = h;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.h, right.h) + 1;

        int dia1 = left.diam;
        int dia2 = right.diam;
        int dia3 = left.h + right.h + 1;

        int myDiam = Math.max(Math.max(dia1, dia2), dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

        return myInfo;
    }

//    Subtree of another tree
//    public static boolean isIdentical(Node root, Node subRoot) {
//        if (root == null && subRoot == null) {
//            return true;
//        }
//        if (root == null || subRoot == null) {
//            return false;
//        }
//        if (root.data == subRoot.data) {
//            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
//        }
//        return false;
//    }
//    public static boolean isSubtree(Node root, Node subRoot) {
//        if (subRoot == null) {
//            return true;
//        }
//        if (root == null) {
//            return false;
//        }
//        if (root.data == subRoot.data) {
//            if (isIdentical(root, subRoot)) {
//                return true;
//            }
//        }
//        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("Root : ");
        System.out.println(root.data);


        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);
        System.out.println();

        System.out.println("Level order : ");
        levelOrder(root);

        System.out.print("Total Nodes : ");
        System.out.println(countOfNodes(root));

        System.out.print("Sum of Nodes : ");
        System.out.println(sumOfNodes(root));

        System.out.print("Height Of Tree : ");
        System.out.println(height(root));

        System.out.print("Diameter of a Tree [O(n^2)] : ");
        System.out.println(diameter(root));

        System.out.print("Diameter of a Tree [O(n)] : ");
        System.out.println(diameter2(root).diam);

    }
}
