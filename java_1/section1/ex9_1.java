package section1;

import java.util.Scanner;

public class ex9_1 {
    public int solution(String s){
        // 방법1
//        int answer = 0;
//
//        for(char x : s.toCharArray()){
//            if(x >= 48 && x <=57){
//                answer = answer*10+(x-48);
//            }
//        }
        String answer = "";

        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){ //Character.isDigit -> 문자인지 숫자인지 확인
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        ex9_1 T = new ex9_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
