package bfsdfs.bfs;

import com.sun.security.auth.module.NTLoginModule;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진 탐색 트리
 *
 * BFS (Breadth-Frist Search)
 * 넓이 우선 탐색 - 출발점에서 어떤 특정 조건을 갖는 지역으로 갈 때의 [최단거리]이다.
 *
 * 간선의 갯수마다 level이 증가한다.
 *
 *
 */
public class BinarySearchTree {

    static Node root;

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bfs(root);

    }

    private static void bfs(Node node) {

        Queue<Node> q = new LinkedList<>();

        q.offer(node);

        int L = 0;
        while (!q.isEmpty()) {
            // 최초에 q.size()는 1이다. 왜냐면, root에는 1만 들어있기 때문에..
            int size = q.size();
            System.out.print(L + " : ");

            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                System.out.print(current.data + " ");
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }
            L++;
            System.out.println();
        }

    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
