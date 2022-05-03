package section7;

import java.util.Scanner;

// 부분집합 구하기 (DFS) - 자연수 N이 주어지면 1부터 N까지 원소를 갖는 집합의 부분집합을 모두 출력
public class ex06 {

    static int n; // 집합의 원소의 개수
    static int[] ch; // 체크배열

    public void DFS(int L){
        if(L == n+1){ // 종료지점
            String tmp = "";
            for(int i =1; i <= n; i++){
                if(ch[i]==1) tmp += (i + " ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            ch[L] = 1; // 1 -> 사용한다.
            DFS(L+1); // 왼쪽 (사용한다.)
            ch[L] = 0; // 0 -> 사용하지 않는다.
            DFS(L+1); // 오른쪽 (사용하지 않는다.)
        }

    }

    public static void main(String[] args) {
        ex06 T  = new ex06();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n+1]; // 인덱스 사용하기 위해서 n+1로 크기를 선언
        T.DFS(1);
    }
}
