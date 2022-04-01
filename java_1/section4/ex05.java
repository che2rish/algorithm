package section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// K번째 큰 수 - 1부터 100사이의 자연수가 적힌 N장의 카드중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록
// 기록한 값 중 k번째로 큰 수를 출력 , k번째 수가 존재하지 않으면 -1 출력

public class ex05 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int num[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        // Collections.reverseOrder() -> 역순..??
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

       for(int i = 0; i < n-2; i++){
           for(int j = i+1; j < n-1; j++){
               for(int m = j+1; m < n; m++){
                   sum = num[i] + num[j] + num[m];
                   treeSet.add(sum);
                   sum = 0;
               }
           }
       }

       int count = 0;
       for (int x : treeSet){
           count++;
           if(count == k) System.out.println(x);
       }
       if(count < k) System.out.println(-1);


    }
}
