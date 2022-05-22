package sw;

import java.util.Scanner;
/*
1983. 조교의 성적 매기기
총점 = 중간고사(35%) + 기말고사(45%) + 과제(20%)
10개의 평점을 높은 순으로 학점을 배정 -> k번째 학생의 학점은?
 */
public class 조교의성적매기기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            double arr[] = new double[n];
            double rate[] = {0.35,0.45,0.2};
            String score[] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
            for(int j = 0; j < n; j++) {
                double sum = 0;
                for (int l = 0; l < 3; l++) {
                    int a = sc.nextInt();
                    sum +=  a * rate[l];
                }
                arr[j] = sum;

            }
            int count = 0;
            for(double j : arr){
                if(arr[k-1]< j) count++;
            }

            System.out.println("#" + (i+1)+ " " +score[count/(n/10)]);
        }
    }
}
