package section5;

import java.util.Scanner;
import java.util.Stack;

// 괄호문자제거 - 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력
public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                while(st.pop() !='(');
            }else st.push(str.charAt(i));
        }

        for(int i =0; i < st.size(); i++){
            System.out.print(st.get(i));
        }

    }
}
