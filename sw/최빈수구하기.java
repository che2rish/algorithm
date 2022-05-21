package sw;

/*
 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 학생 1000명의 점수가 주어지면 최빈수를 이용하여 평균 수준을 짐작 -> 최빈수 출력
 */

import java.util.HashMap;
import java.util.Scanner;

public class 최빈수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int test = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j = 0; j < 1000; j++){
                int s = sc.nextInt();
                hm.put(s,hm.getOrDefault(s,0)+1);
            }

            int max = 0;
            int answer = 0;
            for(int j : hm.keySet()){
                if(max <= hm.get(j)) {
                    max = hm.get(j);
                    answer = j;
                }
            }
            System.out.println("#"+ test + " " + answer);
        }
    }
}
