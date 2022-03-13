package section2;

import java.util.Arrays;
import java.util.Scanner;

// 피보나치 수열 - 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
// 입력은 피보나치 수열의 총 항의 수
public class ex04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum[] = new int[num];
        sum[0] = sum[1] = 1;

        for(int i = 2; i < num; i++){
            sum[i] = sum[i-2] + sum[i-1];
        }

        for(int i = 0; i < num; i++){
            System.out.print(sum[i] + " ");
        }

        //System.out.println(Arrays.toString(sum));
    }
}
