package section1;

import java.util.Scanner;

// 암호
// # -> 1 , * -> 0 으로 변환하여 아스키코드로
public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        String[] s = new String[num];

        str = str.replace("*","0");
        str = str.replace("#","1");

        for(int i = 0; i <num; i++){
            s[i] = str.substring(0,7);
            str = str.substring(7);
            // System.out.println(s[i]);
            System.out.print((char)(Integer.parseInt(s[i],2))); // 2진수로 변환 -> 아스키코드
        }


    }
}
