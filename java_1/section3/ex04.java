package section3;

import java.util.Scanner;

// 연속 부분수열 - N개의 수로 이루어진 수열이 주어지면 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지
public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[] = new int[n];
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int c = 0;

        for(int i = 0; i < n; i++){
            sum += num[i];
            if(sum > m){
                while(sum > m) {
                    sum -= num[c++];
                }
            }
            if(sum == m){
                count++;
                sum -= num[c++];
            }
        }
        System.out.println(count);
    }
}
