package section1;

import java.util.Scanner;

// 문자 찾기
public class ex1 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toLowerCase(); // 대문자나 소문자로 모두 변경
        t = Character.toLowerCase(t); // 대문자나 소문자로 모두 변경

        for(int i = 0; i < str.length(); i++){
            if(t == str.charAt(i)){
                answer++;
            }
        }

        // 향상된 for문 사용
//        for(char x: str.toCharArray()) {// toCharArray : 문자 배열 객체 생성
//            if(x == t){
//                answer++;
//            }
//        }

        return answer;
    }

    public static void main(String[] args){
        ex1 T = new ex1();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine(); // kb.next();
        char t = kb.nextLine().charAt(0); // kb.next().charAt(0);

        System.out.print(T.solution(str,t));
    }
}
