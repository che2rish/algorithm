package section6;

import java.util.Scanner;

// 뮤직비디오 (결정알고리즘) - DVD의 크기를 최소로 하고, M개의 DVD는 모두 같은 크기로
// DVD의 최소 용량 크기를 출력
public class ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int lt = num[n-1];

        int rt = 0;
        for(int i = 0; i < num.length; i++){
            rt += num[i];
        }

        int answer = 0;

        while(lt <= rt){
            int mid = (lt+rt)/2;
            int count = 1;
            int sum = 0;

            for(int i = 0; i < n; i++){
                if(sum + num[i] > mid){
                    count++;
                    sum = num[i];
                }else {
                    sum += num[i];
                }
            }

            if(count <= m){
                answer = mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }

        }

        System.out.println(answer);

    }
}
