package section1;

import java.util.Scanner;

public class ex6_1 {
    public String solution(String str){
        String answer = "";
        for(int i = 0; i <str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){ // 현재의 위치랑 indexOf의 위치가 같을때만
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ex6_1 T = new ex6_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
