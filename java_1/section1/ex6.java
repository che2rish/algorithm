package section1;

import java.util.Scanner;

// 중복 문자 제거 - 한개의 문자열을 입력하면 중복된 문자를 제거하고 출력 (순서는 유지)
public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String tmp = "";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < tmp.length(); j++){
                if(tmp.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            if(count == 0){
                tmp += str.charAt(i);
            }
            count = 0;
        }
        System.out.println(tmp);
    }

}
