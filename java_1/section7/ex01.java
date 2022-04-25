package section7;

import java.util.Scanner;

// 재귀함수 - 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력
public class ex01 {
    public void solution(int n){
        if(n == 0) {
            return ;
        }
        solution(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        ex01 T = new ex01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        T.solution(n);
    }
}
