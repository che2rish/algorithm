package section6;

import java.util.Scanner;

// 삽입 정렬 - 두 번째 자료부터 시작하여 그 앞의 자료들과 비교하여 삽입할 위치를 지정한 후
// 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬
// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++){
            int key = num[i];
            for(int j = i-1; j >= 0; j--){
                if(key < num[j]){
                   int tmp = num[j];
                   num[j] = num[j+1];
                   num[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
    }
}
