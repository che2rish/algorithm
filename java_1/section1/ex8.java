package section1;

import java.util.Scanner;

// 팰린드롬 -> 앞에서 읽을 때나 뒤에서 읽을 때나 깉은 문자열
// 팰린드롬이면 'YES' , 아니면 'NO'
// 단 회문 검사할때 알파벳만 검사, 대소문자 구분 안함
public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String tmp = "";

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                tmp += ch;
            }
        }

        String reverse = new StringBuilder(tmp).reverse().toString();

        if(tmp.equalsIgnoreCase(reverse)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
