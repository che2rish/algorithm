package baekjoon;

import java.util.*;

public class 꼬마정민 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // (1 <= A, B, C <= 10^12) 이므로 long
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a+b+c);
    }
}
