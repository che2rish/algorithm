package section7;

import java.util.Scanner;

// 팩토리얼
public class ex03 {
    public int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        ex03 T = new ex03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.factorial(n));
    }
}
