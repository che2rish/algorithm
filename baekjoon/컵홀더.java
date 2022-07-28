package baekjoon;

import java.util.Scanner;
import java.util.Stack;

// 2810. 컵홀더
public class 컵홀더 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String str = sc.next();
        Stack<Character> st = new Stack<>();
        st.add('*');
        for (int i = 0; i <n ; i++) {
            char ch = str.charAt(i);
            if(ch == 'S' && st.peek() == '*'){
                if(st.size() == 1) st.push(ch);
                else {
                    st.push(ch);
                    st.push('*');
                }
            }else if(ch == 'S' && st.peek() != '*'){
                st.push('*');
                st.push(ch);
            }else if(ch == 'L' && st.peek() == '*'){
                st.push(ch);
            }else if(ch == 'L' && st.peek() != 'L'){
                st.push('*');
                st.push(ch);
            }else if(ch == 'L'){
                st.push(ch);
                st.push('*');
            }
        }

        while(st.size() != 0){
            if(st.pop()=='*') count++;
        }
        System.out.println(count);
    }
}
