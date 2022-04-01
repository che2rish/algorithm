package section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// TreeSet -> 중복 제거하면서 자동 정렬
public class ex05_1 {
    public int solution(int[] arr, int n, int k){
        int answer = -1;
        // 기본적으로 오름차순 정렬 -> Collections.reverseOrder()하면 내림차순으로 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int l = j+1; l < n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        // Tset.remove();
        // System.out.println(Tset.size());
        // System.out.println(Tset.first()); -> 맨 처음 값
        // System.out.println(Tset.last()); -> 맨 마지막 값

        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args){
        ex05_1 T = new ex05_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr,n,k));
    }
}
