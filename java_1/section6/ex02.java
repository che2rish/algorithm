package section6;

import java.util.Scanner;

// 버블 정렬 - 인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 교환
// 1회전 하면 가장 큰 숫자가 오른쪽에 위치
// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램
public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(num[j]>num[j+1]){
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }

    }
}
