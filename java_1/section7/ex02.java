package section7;

import java.util.Scanner;

// 재귀함수를 이용한 이진수 출력
public class ex02 {

    public void solution(int n){
        if(n == 0) return;
        solution(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        ex02 T = new ex02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.solution(n);
    }
}
