package section3;

import java.util.ArrayList;
import java.util.Scanner;

// 두 배열 합치기 : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력
public class ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int num1[] = new int[n1];
        for(int i = 0; i < n1; i++){
            num1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int num2[] = new int[n2];
        for(int i = 0; i < n2; i++){
            num2[i] = sc.nextInt();
        }

        ArrayList<Integer> num = new ArrayList<>();

        int a=0, b=0;

        if(n1 < n2){
            while(a < n1){
                if(num1[a]<num2[b]){
                    num.add(num1[a]);
                    a++;
                }else{
                    num.add(num2[b]);
                    b++;
                }
            }
            while(b < n2){
                num.add(num2[b]);
                b++;
            }
        }else{
            while(b < n2){
                if(num1[a]<num2[b]){
                    num.add(num1[a]);
                    a++;
                }else{
                    num.add(num2[b]);
                    b++;
                }
            }
            while(a < n1){
                num.add(num1[a]);
                a++;
            }
        }
//        System.out.println(num);
        for(int x : num){
            System.out.print(x+ " ");
        }
    }
}
