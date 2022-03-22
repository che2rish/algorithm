package section3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01_1 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m){ // 둘 중 하나가 n이나 m으로 가면 while문 종료
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args){
        ex01_1 T = new ex01_1();
        Scanner kb= new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n,m,a,b)) System.out.print(x+" ");
    }
}
