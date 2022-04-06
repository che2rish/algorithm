package section5;

import java.util.Scanner;
import java.util.Stack;

// 후위식 연산(postfix) - 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램 작성
public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int x =0 ,y = 0;

        Stack<Integer> st = new Stack<>();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) {//Character.isDigit() -> 숫자 및 문자 여부 확인
                st.push(c-'0');
            }else{
                x = st.pop();
                y = st.pop();
                if(c == '+') x = y + x;
                else if(c == '-') x = y - x;
                else if(c == '*') x = y * x;
                else if(c == '/') x = y / x;
                st.push(x);
            }
        }
        System.out.println(st.peek());
    }

}
