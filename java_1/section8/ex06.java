package section8;

import java.util.Scanner;

public class ex06 {

    static int n, m;
    static int[] num ,pm, ch;

    public void DFS(int L){
        if(L == m){
            for(int i : pm) System.out.print(i + " ");
            System.out.println();
        }else{
            for(int i = 0; i < n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = num[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex06 T = new ex06();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        num = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        T.DFS(0);
    }
}
