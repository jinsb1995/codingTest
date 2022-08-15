package bfsdfs.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree 말단 노드까지의 가장 짧은 경로
 *
 * 최단거리 문제는 BFS로 풀어야한다!!!
 *
 * 만약 이 문제를 DFS로 푼다고 가정했을 때
 * DFS는 노드의 자식이 둘 다 있거나, 하나도 없어야 문제를 풀기 쉽다.
 *
 * 만약 노드의 자식이 하나만 있으면 문제 풀기 어렵다.
 *
 */
public class TreeShortestWay_BFS {

    static Node root;

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        bfs(root);
    }

    private static int bfs(Node node) {

        Queue<Node> q = new LinkedList<>();

        int level = 0;

        q.offer(node);

        if (!q.isEmpty()) {

            int len = q.size();

            for (int i = 0; i < len; i++) {
                Node poll = q.poll();

                if (poll.left == null && poll.right == null) return level;

                if (poll.left != null) q.offer(poll.left);
                if (poll.right != null) q.offer(poll.right);
            }
            level++;
        }

        System.out.println("level = " + level);
        return 0;
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
