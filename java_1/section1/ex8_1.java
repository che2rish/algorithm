package section1;

import java.util.Scanner;

public class ex8_1 {
    public String solution(String s){
        String answer = "NO";
        // replaceAll은 정규식 사용 가능, replace는 정규식 사용 X
        s = s.toUpperCase().replaceAll("[^A-Z]",""); // 대문자 A~Z가 아니면 빈문자화

        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        ex8_1 T = new ex8_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
