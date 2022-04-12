package section6;

import java.util.Scanner;

// 선택정렬 - 여러개의 데이터가 무작위로 있을 때 전체 데이터에서 매번 가장 작은(또는 가장 큰)데이터를 선책하여 데이터간의 위치를 변경
// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램

public class ex01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(num[j] < min) min = num[j];
                if(min == num[j]) {
                    int tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }
            System.out.print(num[i] + " ");
            min = Integer.MAX_VALUE;
        }

    }
}
