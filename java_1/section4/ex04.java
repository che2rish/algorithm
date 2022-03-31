package section4;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기 (해쉬, 투포인터, 슬라이딩 윈도우) - S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램
// 아나그램 판별시 대소문자 구분됨, 부분문자열은 연속된 문자열
public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int num = 0 , count = 0, k = 0;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        for(char x : map2.keySet()){
            if(map1.get(x) == map2.get(x)){
                num++;
            }
        }
        if(num == map2.size()) {
            count++;
        }

        while(k < s.length() - t.length()){
            num = 0;
            if(map1.get(s.charAt(k)) == 1){
                map1.remove(s.charAt(k));
            }else{
                map1.put(s.charAt(k), map1.getOrDefault(s.charAt(k),0)-1);
            }
            map1.put(s.charAt(k+t.length()), map1.getOrDefault(s.charAt(k+t.length()),0)+1);

            for(char x : map2.keySet()){
                if(map1.get(x) == map2.get(x)){
                    num++;
                }
            }
            if(num == map2.size()) {
                count++;
            }
            k++;
        }

        System.out.println(count);
    }
}
