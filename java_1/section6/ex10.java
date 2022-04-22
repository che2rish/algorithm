package section6;

import java.util.Arrays;
import java.util.Scanner;

// 마구간 정하기(결정알고리즘) - C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운
// 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int lt = 1, rt = num[n-1]-1;
        int answer = 0;

        while(lt <= rt){
            int mid = (lt+rt)/2;
            int count = 1;
            int start = num[0];

            for(int i = 0; i < n; i++){
                if(mid + start <= num[i]){
                    count++;
                    start = num[i];
                }
            }

            if(count >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }

        }
        System.out.println(answer);

    }
}
