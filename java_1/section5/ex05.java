package section5;

import java.util.Scanner;
import java.util.Stack;

// 쇠막대기 - 쇠막대기를 아래에서 위로 겹쳐놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기를 자른다.
// 쇠막대기와 레이저의 배치 조건
// 1. 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. (쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다.)
// 2. 긴 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
// 3. 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') st.push(str.charAt(i));
            else {
                st.pop();
                if(str.charAt(i-1) == '(') count += st.size();
                else count++;
            }
        }

        System.out.println(count);

    }
}
