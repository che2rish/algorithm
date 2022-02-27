package section1;

// 대소문자 변환
import java.util.Scanner;

public class ex2 {
    public String solution(String str){
        String answer = "";

        for(int i=0; i <str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                answer += Character.toLowerCase(str.charAt(i));
            }else{
                answer += Character.toUpperCase(str.charAt(i));
            }
        }

        // 풀이1 -> isLowerCase() 사용
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) //isLowerCase -> 문자가 소문자인지 확인
//                answer += Character.toUpperCase(x);
//            else
//                answer += Character.toLowerCase(x);
//        }

        // 풀이2 -> 아스키코드 사용
//        for(char x : str.toCharArray()){
//            if(x >= 97 && x <=122)
//                answer += (char)(x - 32); // 숫자로 출력되므로 캐스팅
//            else
//                answer += (char)(x+32);
//        }

        return answer;
    }

    public static void main(String [] args){
        ex2 T = new ex2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
