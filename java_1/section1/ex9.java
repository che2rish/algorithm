package section1;

import java.util.Scanner;

// 숫자만 추출 - 문자와 숫자가 섞여있는 문자열이 주어지면 숫자만 추출하여 그 순서대로 자연수 만들기
public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String tmp = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isAlphabetic(ch)){ // 특수문자는 구분 불가.. -> error
                tmp += ch;
            }
        }

        int num = Integer.parseInt(tmp);
        System.out.println(num);
    }
}
