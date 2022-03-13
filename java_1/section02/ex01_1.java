package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01_1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // 0번은 무조건 출력
        for(int i = 1; i < n; i++){
            if(arr[i]>arr[i-1])
                answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        ex01_1 T = new ex01_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }

}
