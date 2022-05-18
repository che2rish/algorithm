package section8;

import java.util.Scanner;

// 바둑이 승차(DFS) - C를 넘지 않으면서 트럭에 태울 수 있는 가장 무거운 무게
public class ex02 {

    static int c,n,max = 0;

    public void DFS(int L,int sum,int[] arr){
        if(sum > c) return;
        if(L == n){
            max = Math.max(sum,max);
        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }
    public static void main(String[] args) {
        ex02 T = new ex02();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        T.DFS(0,0,arr);
        System.out.println(max);
    }
}
