package section8;

import java.util.Scanner;

// 최대점수 구하기(DFS) - 제한시간 M안에 N개의 문제 중 최대점수를 출력
public class ex03 {

    static int n,m,answer = 0;

    public void DFS(int L, int sp, int st, int[] a, int[] b){
        if(st > m) return;
        if(L==n){
            answer = Math.max(sp,answer);
        }else{
            DFS(L+1,sp+a[L],st+b[L],a,b);
            DFS(L+1,sp,st,a,b);
        }
    }

    public static void main(String[] args) {
        ex03 T = new ex03();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
