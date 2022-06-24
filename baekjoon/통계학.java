package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 통계학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력값의 범위 : -4000 ~ 4000
        int n = sc.nextInt();
        int[] arr = new int[n];
        // float의 범위 초과?? -> double 사용
        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        System.out.println((int)Math.round((sum / n)));
        System.out.println(arr[n/2]);

        int max = -1, count = 0, k = arr[0];
        boolean secound = false;

        for(int i=0 ; i < n-1; i++) {
            if(arr[i]==arr[i+1]) {
                count++;
            }else {
                count = 0;
            }
            if(count > max) {
                max = count;
                k = arr[i];
                secound = true;
            }else if(count == max && secound == true) {
                k = arr[i];
                secound = false;
            }
        }
        System.out.println(k);
        System.out.println(arr[n-1]-arr[0]);

    }
}
