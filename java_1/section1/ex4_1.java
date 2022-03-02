package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4_1 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        // 방법1. StringBuilder 사용
//        for(String x : str){
//            // StringBuilder로 객체를 만들어서 reverse로 뒤집은 후 toString으로 String으로 만들어준다.
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp); // ArrayList에 추가
//        }

        // 방법2
        for(String x : str){
            char[] s = x.toCharArray(); // String 단어를 문자배열로
            int lt = 0;
            int rt = x.length()-1;

            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // s라는 문자배열을 String으로
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        ex4_1 T = new ex4_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = kb.next();
        }
        for(String x : T.solution(n,str)){
            System.out.println(x);
        }
    }
}
