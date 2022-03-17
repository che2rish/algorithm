package section2;

import java.util.Scanner;

// 등수구하기 -> N명의 학생의 점수가 입력되면 각 학생의 등수를 입력한 순서대로 출력
// 같은 점수가 입력될 경우 높은 등수로 동일 처리 (가장 높은 점수가 92점이고 92점이 3명이 존재하면 1등이 3명 다음 학생은 4등)
public class ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int score[] = new int[n];
        int count = 1;

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(score[i] < score[j]){
                    count++;
                }
            }
            System.out.print(count + " ");
            count = 1;
        }
    }
}
