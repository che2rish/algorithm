package section8;

import java.util.Scanner;

// 조합수(메모이제이션) - 재귀를 이용해 조합수 출력 (메모이제이션 사용 X)
public class ex07 {
    public int DFS(int n, int r){
        if(n==r || r == 0) return 1;
        else return DFS(n-1,r-1) + DFS(n-1,r);
    }

    public static void main(String[] args) {
        ex07 T = new ex07();
        Scanner kb= new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
