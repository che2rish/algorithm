package section1;

import java.util.Scanner;

// 회문문자열 -> 앞에서 읽을 때나 뒤에서 읽을떄나 같은 문자열
// 해당 문자열이 회문문자열이면 'YES' , 회문문자열이 아니면 'NO'출력
public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String reverse = "";

        str = str.toLowerCase();

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
