package section2;

import java.util.Scanner;

// 점수계산 -> 연속으로 답을 맞추면 가산점 (첫문제 1점, 두 번째 문제 2점 세 번째 문제 3점..)
// 답이 틀리다가 다시 맞추면 다시 1점부터 시작
// 답을 맞추면 1, 틀리면 0
public class ex07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        int score = 1;
        int sum = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(num[i] == 1){
                sum += score;
                score++;
            }else{
                score = 1;
            }
        }
        System.out.println(sum);
    }
}
