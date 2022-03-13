package section2;

import java.util.Scanner;

// 보이는 학생 - 일렬로 서있는 학생들 중 맨 앞에 서있는 선생님이 볼 수 있는 학생의 수
// 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않는다.
public class ex02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];
        int count = 1;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int height = num[0];
        for(int i = 1; i < n; i++){
            if(height < num[i]){
                count++;
                height = num[i];
            }
        }
        System.out.println(count);

    }
}
