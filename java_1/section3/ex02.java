package section3;

import java.util.*;

// 공통원소 구하기 - A,B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력
public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> arr = new ArrayList<>();

        int c = 0, d = 0;

        while(c < n && d < m){
            if(a[c] == b[d]){
                arr.add(a[c]);
                c++;
                d++;
            }else if(a[c] < b[d]){
                c++;
            }else{
                d++;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
