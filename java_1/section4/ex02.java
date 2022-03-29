package section4;

import java.util.HashMap;
import java.util.Scanner;

// 아나그램 (해쉬) - Anagram이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하는 두 단어
// 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별
public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        HashMap<Character,Integer> alphabet1 = new HashMap<>();
        HashMap<Character,Integer> alphabet2 = new HashMap<>();

        for(char x : str1.toCharArray()){
            alphabet1.put(x, alphabet1.getOrDefault(x,0)+1);
        }

        for(char x : str2.toCharArray()){
            alphabet2.put(x, alphabet2.getOrDefault(x,0)+1);
        }
        int count = 0;
        for(char key : alphabet1.keySet()) {
            if(alphabet2.get(key) == alphabet1.get(key)){
                count++;
            }
        }
        if(count == alphabet1.size()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
