package section1;

import java.util.Scanner;

// 문자열 압축 - 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기
// 단 1인 경우 생략
public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next()+" ";
        int count = 0;

        String answer = "";

        for(int i = 0; i < str.length()-1; i++){
            count++;
                if (str.charAt(i) != str.charAt(i+1)) {
                    if(count != 1) {
                        answer = answer + str.charAt(i) + count;
                        count = 0;
                    }else{
                        answer = answer + str.charAt(i);
                        count = 0;
                    }
                }
            }

        System.out.println(answer);
    }
}
