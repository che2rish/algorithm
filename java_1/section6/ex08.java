package section6;

import java.util.Arrays;
import java.util.Scanner;

// 이분검색 - N개의 수를 오름차순으로 정렬한 다음 N개의 수중 한 개의 수인 M이 주어지면
// 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램
// 단 중복값은 존재하지 않습니다.
public class ex08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        // 배열의 시작위치 끝위치 변수
        int start = 0;
        int end = n-1;

        // 중간값 저장 변수
        int mid = 0;

        while(true){
            if(start <= m){
                mid = (start + end) / 2;
                if(m == num[mid]){
                    System.out.println(mid+1);
                    break;
                }
                if(m < num[mid]){
                    // 찾고자 하는 값이 중간값보다 작으면 끝위치를 중간값에서 하나 뺀 값으로 재설정
                    end = mid - 1;
                }else{
                    // 찾고자 하는 값이 중간값보다 크면 시작위치를 중간값에서 하나 더한 값으로 재설정
                    start = mid + 1;
                }
            }
        }
    }
}
