package section5;


import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호 - 괄호가 입력되면 올바른 괄호이면 "YES",올바르지 않으면 "NO" 출력
// 에러남
public class ex01 {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') st.push('(');
            else {
                if(st.size() != 0) st.pop();
                else {
                    st.push(str.charAt(i));
                    break;
                }
            }
        }

        if(st.size() == 0) System.out.println("YES");
        else System.out.println("NO");


    }
}
