package section2;

import java.util.Scanner;

// 에라코스테네스 체 -> 어떤 수 n이 있을 경우 n의 배수는 소수가 될 수 없다.
public class ex05_1 {
    public int solution (int n){
        int answer = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i <= n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j = i; j <= n; j = j+i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ex05_1 T = new ex05_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

}
