package bfsdfs.dfs;

/**
 * 부분집합
 *
 * DFS
 *
 */
public class SubsetDFS {

    static int n;
    static int[] ch;  // 체크해주는 배열인데, n + 1이된다.

    public static void main(String[] args) {

        n = 3;
        ch = new int[n + 1];
        dfs(1);
    }

    private static void dfs(int l) {
        if (l == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp );
        } else {
            ch[l] = 1;
            dfs(l + 1);  // 왼쪽으로 뻗어나가는 부분
            ch[l] = 0;
            dfs(l + 1);  // 오른쪽으로 뻗어나가는 부분
        }
    }
}
