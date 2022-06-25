package baekjoon;

import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int arr[] = new int[m];
            double sum = 0;
            for(int j = 0; j < m; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = sum/m;
            double count = 0;
            for(int j = 0; j < m; j++){
                if(arr[j]> avg) count++;
            }
            // 소수점 셋째 자리까지 출력
            System.out.printf(String.format("%.3f", count/m *100 ));
            System.out.println("%");
        }
    }
}
