package section6;

import java.util.Arrays;
import java.util.Scanner;

// 장난꾸러기 - 철수와 짝궁이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때
// 철수가 받은 번호와 철수 짝꿍이 받은 번호를 차례대로 출력하는 프로그램
public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h[] = new int[n];
        int sort_h[] = new int[n];

        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            sort_h[i] = h[i];
        }

        Arrays.sort(sort_h);

        for(int i = 0; i < n; i++){
            if(h[i] != sort_h[i]) System.out.print(i+1 + " ");
        }

    }
}
