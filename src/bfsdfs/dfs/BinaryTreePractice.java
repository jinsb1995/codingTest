package bfsdfs.dfs;

/**
 * 이진트리
 *
 * DFS (Depth-First Search)
 *
 * 깊이 우선 탐색
 *
 *  전위순회 (preOrder)
 *
 *  중위순회 (inOrder)
 *
 *  후위순회 (PostOrder)
 */
public class BinaryTreePractice {

    public static void main(String[] args) {

        Node leftLeft = new Node(null, 4, null);
        Node leftRight = new Node(null, 5, null);
        Node rightLeft = new Node(null, 6, null);
        Node rightRight = new Node(null, 7, null);
        Node left = new Node(leftLeft, 2, leftRight);
        Node right = new Node(rightLeft, 3, rightRight);
        Node root = new Node(left, 1, right);

        preOrderDFS(root);
        System.out.println();
        inOrderDFS(root);
        System.out.println();
        postOrderDFS(root);
    }

    private static void preOrderDFS(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderDFS(node.left);
            preOrderDFS(node.right);
        }
    }
    private static void inOrderDFS(Node node) {
        if (node != null) {
            inOrderDFS(node.left);
            System.out.print(node.data + " ");
            inOrderDFS(node.right);
        }
    }
    private static void postOrderDFS(Node node) {
        if (node != null) {
            postOrderDFS(node.left);
            postOrderDFS(node.right);
            System.out.print(node.data + " ");
        }
    }


    static class Node {
        Node left;
        int data;
        Node right;

        public Node(Node left, int data, Node right) {
            this.left = left;
            this.data = data;
            this.right = right;
        }
    }


}
