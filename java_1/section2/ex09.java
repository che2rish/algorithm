package section2;

import java.util.Scanner;

// 격자판 최대합 - N * N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
public class ex09 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pan[][] = new int[n][n];
        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                pan[i][j] = sc.nextInt();
            }
        }

        // 행의 합
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += pan[i][j];
                if(sum > max){
                    max = sum;
                }
            }
            sum = 0;
        }

        // 열의 합
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += pan[j][i];
                if(sum > max){
                    max = sum;
                }
            }
            sum = 0;
        }

        // 대각선의 합
        for(int i = 0; i < n; i++){
            sum += pan[i][i];
            if(max < sum){
                max = sum;
            }
        }

        sum = 0;
        for(int i = 0; i < n; i++){
            sum += pan[n-i-1][i];
            if(max < sum){
                max = sum;
            }
        }

        System.out.println(max);

    }
}
