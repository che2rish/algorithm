package section1;

import java.util.Scanner;

// N개의 단어가 주어지면 각 단어를 뒤집어 출력
public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str[] = new String[num];
        String word = "";

        for(int i = 0; i < num; i++){
           str[i] = sc.next();
           for(int j = str[i].length()-1; j >= 0; j--){
              word +=  str[i].charAt(j);
           }
           str[i] = word;
           word = "";
        }

        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
