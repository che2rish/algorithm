package section3;

import java.util.Scanner;

// 최대 매출 - N일 동안의 매출기록을 주고 연속 된 k일 동안의 최대 매출액
public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int sales[] = new int[n];
        int max , sum = 0;

        for(int i = 0; i < n; i++){
            sales[i] = sc.nextInt();
        }

        for(int i =0 ; i < k; i++){
            sum += sales[i];
        }

        max = sum;

        for(int i = k; i < n; i++){
            sum -= sales[i-k];
            sum += sales[i];
            if(max < sum) max = sum;
        }

        System.out.println(max);

    }
}
