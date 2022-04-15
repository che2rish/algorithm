package section6;

import java.util.Arrays;
import java.util.Scanner;

// 중복 확인 - N명의 학생이 적어낸 숫자 중 중복된 숫자가 존재하면 D,
// N명이 모두 각자 다른 숫자를 적어냈다면 U 출력

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        String answer = "U";

        for(int i = 0; i < n-1; i++){
           if(num[i] == num[i+1]){
               answer = "D";
               break;
           }
        }
        System.out.println(answer);
    }
}
