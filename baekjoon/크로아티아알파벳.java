package baekjoon;

import java.util.Scanner;

// 2941.크로아티아 알파벳
public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next()+" ";
        int n = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'c' && (str.charAt(i+1) == '=' || str.charAt(i+1) == '-' )){
                i++;
            }else if(str.charAt(i)=='d'){
                if(str.charAt(i+1) == '-') {
                    i++;
                }else if(str.charAt(i+1) == 'z' && str.charAt(i+2) == '='){
                    i = i+2;
                }
            }else if(str.charAt(i) == 'l' && str.charAt(i+1) == 'j'){
                i++;
            }else if(str.charAt(i) == 'n' && str.charAt(i+1) == 'j'){
                i++;
            }else if(str.charAt(i) == 's' && str.charAt(i+1) == '='){
                i++;
            }else if(str.charAt(i) == 'z' && str.charAt(i+1) == '='){
                i++;
            }
            n++;
        }

        System.out.println(n);

    }
}
