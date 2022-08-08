package bfsORdfs;

public class SubsetDFS {

    public static void main(String[] args) {

        int n = 3;

        dfs(n);
    }

    private static void dfs(int n) {

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
