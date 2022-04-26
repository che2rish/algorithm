package programmers;

import java.util.Scanner;

// 숫자 문자열과 영단어 - 숫자의 일부가 영단어로 바뀐 문장을 원래 숫자로 출력
public class ex03 {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String str2 = "";
        char[] ch = s.toCharArray();
        for(int i = 0; i <s.length(); i++){
            if(!Character.isAlphabetic(ch[i])) {
                System.out.println(ch[i]);
                str2+= ch[i];
            }else{
                str += ch[i];
                switch(str){
                    case "zero" :
                        System.out.println(0);
                        str2 += 0;
                        str = "";
                        break;
                    case "one" :
                        System.out.println(1);
                        str2 +=1;
                        str = "";
                        break;
                    case "two" :
                        System.out.println(2);
                        str2 +=2;
                        str = "";
                        break;
                    case "three" :
                        System.out.println(3);
                        str2 +=3;
                        str = "";
                        break;
                    case "four" :
                        System.out.println(4);
                        str2 +=4;
                        str = "";
                        break;
                    case "five" :
                        System.out.println(5);
                        str2 +=5;
                        str = "";
                        break;
                    case "six" :
                        System.out.println(6);
                        str2 +=6;
                        str = "";
                        break;
                    case "seven" :
                        System.out.println(7);
                        str2 +=7;
                        str = "";
                        break;
                    case "eight" :
                        System.out.println(8);
                        str2 +=8;
                        str = "";
                        break;
                    case "nine" :
                        System.out.println(9);
                        str2 +=9;
                        str = "";
                        break;

                }
            }
        }
        answer = Integer.parseInt(str2);
        return answer;
    }

    public static void main(String[] args) {
        ex03 T = new ex03();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
