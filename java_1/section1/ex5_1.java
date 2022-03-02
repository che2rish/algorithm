package section1;

import java.util.Scanner;

public class ex5_1 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){ // 알파벳이 아닐때
                lt ++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt --;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args){
        ex5_1 T = new ex5_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
