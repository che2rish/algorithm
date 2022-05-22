package sw;

import java.util.Scanner;
/*
1979. 어디에 단어가 들어갈 수 있을까
단어퍼즐의 가로, 세로 길이 => n
단어의 길이 => k
k길이의 단어가 들어갈 수 있는 공간의 개수 출력
 */
public class 어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    arr[j][l] = sc.nextInt();
                }
            }

            int word = 0;

            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int l = 0; l < n; l++) {
                    if(arr[j][l] == 1) count++;
                    else {
                        if(count == k) word++;
                        count = 0;
                    }
                }
                if(count == k) word++;
            }

            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int l = 0; l < n; l++) {
                    if(arr[l][j] == 1) count++;
                    else {
                        if(count == k) word++;
                        count = 0;
                    }
                }
                if(count == k) word++;
            }
            System.out.println("#" + (i+1)+ " "+word);
        }
    }
}
