package section3;

import java.util.Scanner;

// 연속된 자연수의 합 - N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력
public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, count = 0, c = 1;

        for(int i = 1; i < n; i++){
            sum += i;
            if(sum > n){
                while(sum > n){
                    sum -= c;
                    c++;
                }
            }
            if(sum == n) {
                count++;
                sum -= c;
                c++;
            }
        }

        System.out.println(count);
    }
}
