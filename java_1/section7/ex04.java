package section7;

import java.util.Scanner;

// 피보나치 수열
public class ex04 {
    public int Fibonacci(int n){

        if(n == 1) return 1;
        else if (n == 2) return 1;
        else return Fibonacci(n-1) + Fibonacci(n-2);

    }

    public static void main(String[] args) {
        ex04 T = new ex04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print(T.Fibonacci(i) + " ");
        }

    }
}
