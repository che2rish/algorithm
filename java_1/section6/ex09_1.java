package section6;

import java.util.Arrays;
import java.util.Scanner;

public class ex09_1 {

    // DVD가 몇 장 필요한지 리턴
    public int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            }else sum += x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // max(), min() -> getAsInt() 필요
        int rt = Arrays.stream(arr).sum(); // 기본형 int를 리턴해서 getAsInt() 필요 X

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid) <= m){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ex09_1 T = new ex09_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
