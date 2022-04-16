package programmers;

import java.util.Scanner;

public class ex01 {
    // 626331이 int 범위를 벗어나서 에러 long형으로 변경해줘야함
    public int solution(long num) {
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = num*3+1;
            }
            answer++;
        }

        if(answer > 500) return -1;

        return answer;
    }

    public static void main(String[] args) {
        ex01 T = new ex01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
