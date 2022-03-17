package section2;

import java.util.Scanner;

// 봉우리 - N * N 격자판이 주어지면 각 격자판 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역
// 봉우리 지역이 몇 개 있는지 알아내는 프로그램 작성
public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int peak[][] = new int[n+2][n+2];
        int count = 0;

        for(int i = 0; i < n+2; i++){
            peak[0][i] = 0;
            peak[i][0] = 0;
            peak[n+1][i] = 0;
            peak[i][n+1] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                peak[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j <n+1; j++){
               if(peak[i][j] > peak[i-1][j] && peak[i][j] > peak[i+1][j] && peak[i][j] > peak[i][j-1] && peak[i][j] > peak[i][j+1]){
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}
