package section1;

import java.util.Scanner;

// 첫번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력
public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = new StringBuilder(str).reverse().toString();
        char ch = sc.next().charAt(0);
        int count = 99; // 0으로 초기화 하면 안됨..
        int num[] = new int[str.length()];

        for(int j = 0; j < str2.length(); j++){
            if (str2.charAt(j) != ch) {
                count++;
            } else {
                count = 0;
            }
            num[j] = count;
        }

        count = 99;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                count++;
            } else {
                count = 0;
            }

            if(num[str.length()-i-1] >= count){
                System.out.print(count+" ");
            }else{
                System.out.print(num[str.length()-i-1]+" ");
            }
        }

    }
}
