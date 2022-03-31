package study.tree;

/*
    Binary Heaps
        최대값이나 최소값을 찾아내는 연산을 빠르게 하기 위해 고안된 '*완전 이진 트리'를 기본으로한 자료구조

    Min Heap
        - 현재 노드의 부모는 항상 작은값이다.
        - 트리의 root에는 가장 작은값이 온다.
        - O(log N)

    Max Heap
        - 현재 노드의 부모는 항상 큰 값이다.
        - 트리의 root에는 가장 큰 값이 온다.
        - O(log N)

    * 완전 이진 트리
      Level이 맞고, 노드들이 level별로 왼쪽부터 채워져 있는 것

        3 5 2 6 4

            2
         ↙     ↘
        4       3
     ↙     ↘
   5        6

   * 최소힙에 노드 삽입하기
     완전 트리 맨 끝에 노드를 추가하는데, 마지막레벨의 왼쪽부터 채워준다.
     1. 자신의 부모노드와 비교해서
     2. 자신이 값이 작을때 까지 자리를 바꾼다. (반복)

   * 최소힙에서 노드 꺼내오기
      root의 값을 빼오면 자리가 비어서 채워줘야 하는데,
      1. 완전 이진트리의 맨 마지막 Node를 가져와서, root에 채운다.
      2. 정렬이 안 된 상태이니까
         2-1. 자신의 자식 노드와 비교해서 둘중 작은놈이 위로 오게끔 한다.

 */
public class Heaps {

    public static void main(String[] args) {
        HeapsTree ht = new HeapsTree();

        ht.insert(new HeapsNode(2));
        ht.insert(new HeapsNode(5));
        ht.insert(new HeapsNode(8));
        ht.insert(new HeapsNode(1));
        ht.insert(new HeapsNode(4));
        ht.insert(new HeapsNode(6));
        ht.insert(new HeapsNode(7));
        ht.insert(new HeapsNode(9));
        ht.insert(new HeapsNode(3));
    }
}

class HeapsTree {
    private static final int MAX_SIZE = 100;
    int size = 0;    // 들어있는 노드의 개수
    HeapsNode[] nodes = new HeapsNode[MAX_SIZE];

    /*
       * 최소힙에 노드 삽입하기
         완전 트리 맨 끝에 노드를 추가하는데, 마지막레벨의 왼쪽부터 채워준다.
         1. 자신의 부모노드와 비교해서
         2. 자신이 값이 작을때 까지 자리를 바꾼다. (반복)
     */
    public void insert(HeapsNode node) {
        int idx = ++size;

        // (idx != 1) : root를 넣어준다.
        while ((idx != 1) && (nodes[idx/2].data > node.data)) {
                HeapsNode tmp = nodes[idx/2];
                nodes[idx/2] = node;
                nodes[idx] = tmp;
                idx/=2;
        }

        nodes[idx] = node;
    }
}


class HeapsNode {
    int data;

    public HeapsNode(int data) {
        this.data = data;
    }
}
















