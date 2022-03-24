package study.tree;

/*
    트리 순회 방법

                (1)
             ↙       ↘
           (2)       (3)
        ↙       ↘
      (4)       (5)
  Inorder   (Left, Root, Right) : 4 2 5 1 3
  Preoreder (Root, Left, Right) : 1 2 4 5 3
  Postorder (Left, Right, Root) : 4 5 2 3 1
 */

public class BinaryTreeTraversals {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2, 1, n3);

        t.setRoot(n1);
        t.inorder(t.getRoot());
        System.out.println();
        t.preorder(t.getRoot());
        System.out.println();
        t.postorder(t.getRoot());
        System.out.println();
    }
}


class Node {
    int data;     // root라고 생각하면 됨
    Node left;    // 왼쪽 자식 노드
    Node right;   // 오른쪽 자식 노드
}

class Tree {
    private Node root;      // 부모 노드

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    // main에서 트리 객체를 생성해 값을 넣어주며 트리를 만들어준다.
    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();
        node.left = left;
        node.data = data;
        node.right = right;
        return node;
    }

    public void inorder(Node node) {
        //  left - root - right
        if (node != null) {
            inorder(node.left);     // 왼쪽 데이터를 넣고 자식노드가 없어서(null) 탈출할 때 까지 재귀호출
            System.out.print(node.data + " ");
            inorder(node.right);    // 오른쪽 데이터를 넣고 자식노드가 없어서(null) 탈출할 때 까지 재귀호출
        }
    }


    public void preorder(Node node) {
        // root - left - right
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }


    public void postorder(Node node) {
        // left - right - root
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}