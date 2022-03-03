package section1;

import java.util.Scanner;

public class ex7_1 {
    public String solution(String str){
        // 방법1
//        String answer = "YES";
//
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for(int i = 0; i < len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                return "NO";
//            }
//        }

        // 방법2 - StringBuilder 사용
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)){ // equalsIgnoreCase -> 대소문자 구분 안하고 비교
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args){
        ex7_1 T = new ex7_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
