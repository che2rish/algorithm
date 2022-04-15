package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex06_1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int tmp[] = arr.clone(); // 깊은복사 -> tmp를 정렬해도 arr을 그대로
        Arrays.sort(tmp);

        for(int i = 0; i < n; i++){
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        ex06_1 T = new ex06_1();
        Scanner kb= new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(n,arr)) System.out.print(x+ " ");
    }
}
