package section4;

import java.util.HashMap;
import java.util.Scanner;

public class ex01_1 {
    public char solution (int n, String s){
        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            //map.getOrDefault -> 해당 key의 value값이 없으면 0, 있으면 value값 출력
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // map.containsKey() -> 해당 key의 값이 존재하는지
        // map.size() -> key의 종류 개수
        // map.remove() -> 특정 key 제거

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ex01_1 T = new ex01_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }
}
