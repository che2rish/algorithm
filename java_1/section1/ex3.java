package section1;

import java.util.Scanner;

// 문장 속 단어 -> 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
public class ex3 {
    public String solution(String str){
        String answer="";
        String word[] = str.split(" ");
        int tmp = 0;

        for(int i = 0; i < word.length; i++){
            if(tmp < word[i].length()){
                tmp = word[i].length();
                answer = word[i];
            }
        }
        return answer;
    }

    // 풀이1
//    public String solution(String str){
//        String answer = "";
//
//        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
//        String[] s = str.split(" ");
//        for(String x:s){
//            int len = x.length();
//            if(len>m){
//                m = len;
//                answer = x;
//            }
//        }
//
//        return answer;
//    }

    // 풀이2 -> indexof(), substring()
//    public String solution(String str) {
//        String answer = "";
//
//        int m = Integer.MIN_VALUE,pos;
//        while ((pos=str.indexOf(' ')) != -1) {// 띄어쓰기를 발견못하면 -1 리턴, 발견하면 인덱스 넘버 리턴
//            String tmp = str.substring(0,pos);
//            int len = tmp.length();
//            if(len>m){ // 같은 길이일 경우 앞의 단어를 출력해야 하므로 '='은 사용 X
//                m = len;
//                answer = tmp;
//            }
//            str = str.substring(pos+1);
//        }
//        if(str.length()>m) answer = str; // 마지막 단어는 공백이 없으므로 while문에서 살행 X
//
//        return answer;
//    }

    public static void main(String[] args){
        ex3 T = new ex3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 문장을 입력 받아야 하므로 nextLine
        System.out.print(T.solution(str));
    }
}
