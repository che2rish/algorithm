package section4;

import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류 - N일간의 매출기록과 연속구간의 길이 k가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종류를 출력
public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int sales[]  = new int[n];

        for(int i = 0; i < sales.length; i++){
            sales[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++){
            map.put(sales[i],map.getOrDefault(sales[i],0)+1);
        }
        System.out.print(map.size()+ " ");

        int c = 0;
        while(c < n-k){
            if(map.get(sales[c]) == 1){
                map.remove(sales[c]);
            }else{
                map.put(sales[c],map.getOrDefault(sales[c],0)-1);
            }
            map.put(sales[c+k],map.getOrDefault(sales[c+k],0)+1);
            System.out.print(map.size()+ " ");
            c++;
        }


    }
}
