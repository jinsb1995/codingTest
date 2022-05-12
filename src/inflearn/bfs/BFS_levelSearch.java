package inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_levelSearch {


    Node root;

    public static void main(String[] args) {
        BFS_levelSearch tree = new BFS_levelSearch();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.bfs(tree.root);


    }

    private void bfs(Node root) {

        // Queue에 트리를 넣고 레벨대로 출력을 할거다.
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            int length = q.size();

            System.out.print("Level " + level + " = ");
            for (int i = 0; i < length; i++) {
                Node findNode = q.poll();

                if (findNode.data == 4) System.out.print(" 찾았다!!! ");
                System.out.print(findNode.data + " ");
                if (findNode.left != null) q.offer(findNode.left);
                if (findNode.right != null) q.offer(findNode.right);
            }
            level++;
            System.out.println();
        }



    }


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

}
