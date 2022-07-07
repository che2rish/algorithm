package programmers;

import java.util.Scanner;

public class 이상한문자만들기 {
        public String solution(String s) {
            String answer = "";
            // split(String regex, int limit);
            // 구분자를 바탕으로 배열 형식으로 문자열을 자르지만 limit 수만큼 자른다.
            // limit가 -1(음수)일 경우 배열의 마지막에 빈 문자열이 올 경우 빈 문자열이 그대로 유지
            String str[] = s.split(" ",-1);

            for(int i = 0; i < str.length; i++){
                String word = str[i];
                for(int j = 0; j < word.length(); j++){
                    char ch = word.charAt(j);
                    if(j % 2 != 0) {
                        answer += Character.toLowerCase(ch);
                    }
                    else answer += Character.toUpperCase(ch);
                }
                if(i != str.length-1) answer += " ";
            }

            return answer;
        }

    public static void main(String[] args) {
        이상한문자만들기 T = new 이상한문자만들기();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
