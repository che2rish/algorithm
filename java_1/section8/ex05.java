package section8;

import java.util.Scanner;

// 동전교환 - 거스름돈을 가장 적은 수의 동전으로 교환
public class ex05 {

    static int n,m ,answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, int[] coin){
        if(sum>m) return;
        if(L >= answer) return;
        if(sum==m) {
            answer = Math.min(answer,L);
        }else{
            for(int i = 0; i < n; i++){
                DFS(L+1,sum+coin[i],coin);
            }
        }
    }

    public static void main(String[] args) {
        ex05 T = new ex05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] coin = new int[n];
        for(int i = 0; i < n; i++){
            coin[i] = sc.nextInt();
        }
        m = sc.nextInt();
        T.DFS(0,0,coin);
        System.out.println(answer);
    }
}
