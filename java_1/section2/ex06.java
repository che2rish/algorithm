package section2;

import java.util.Scanner;

// 뒤집은 소수 - N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 출력
public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        int reverse = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
            while(num[i] != 0){
                reverse = reverse *10 + num[i] % 10;
                num[i] = num[i]/10;
            }
            num[i] = reverse;
            reverse = 0;
            //System.out.println(num[i]);
        }

        for(int i = 0; i < n; i++){
            for(int j = 2; j < num[i]; j++){
                if(num[i] % j ==0){
                    count++;
                }
            }
            if(count == 0 && num[i] != 1){
                System.out.print(num[i] + " ");
            }
            count = 0;
        }
    }
}
