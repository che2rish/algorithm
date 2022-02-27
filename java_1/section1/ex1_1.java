package section1;

import java.util.Scanner;

// 특정문자가 입력받은 문자열에 몇개가 존재하는지
public class ex1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char word = sc.nextLine().charAt(0);

        int count = 0;

        str = str.toLowerCase();
        word = Character.toLowerCase(word);

        for(int i = 0; i<str.length(); i++){
            if(word == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }

}
