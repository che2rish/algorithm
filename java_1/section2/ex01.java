package section2;

import java.util.Scanner;

// 큰 수 출력하기 - N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력 (첫번째 수는 무조건 출력)
public class ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        System.out.print(num[0] + " ");
        for(int i = 1; i < n; i++){
            if(num[i-1]<num[i]){
                System.out.print(num[i] + " ");
            }
        }
    }
}
