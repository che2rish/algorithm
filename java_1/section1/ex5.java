package section1;

import java.util.Scanner;

// 특정 문자 뒤집기 - 알파벳과 특수문자로 구성되면 알파벳만 뒤집기
public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt){
            if((s[lt] >= 'a' && s[lt] <= 'z') || (s[lt] >= 'A' && s[lt] <= 'Z')){
                if((s[rt] >= 'a' && s[rt] <= 'z') || (s[rt] >= 'A' && s[rt] <= 'Z')){
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++;
                    rt--;
                }else{
                    rt--;
                }
            }else{
                lt++;
            }
        }
        String tmp = String.valueOf(s);
        System.out.println(tmp);
    }
}
