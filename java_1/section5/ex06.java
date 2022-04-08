package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 공주 구하기 - 왕자가 N명 , K를 외친 왕자가 제외될 때 공주를 구하러 갈 왕자의 번호
public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++) q.offer(i);

        while(q.size() != 1){
            for(int i = 0; i < k; i++){
                if(i != k-1) q.offer(q.peek());
                q.poll();
            }
        }
        System.out.println(q.peek());
    }
}
