package sw;

/*
1940. 가랏! RC카!
입력으로 매 초마다 아래와 같은 command 가 정수로 주어진다.

0 : 현재 속도 유지.
1 : 가속
2 : 감속

위 command 중, 가속(1) 또는 감속(2) 의 경우 가속도의 값이 추가로 주어진다.

입력으로 주어진 N 개의 command 를 모두 수행했을 때, N 초 동안 이동한 거리를 계산
 */
import java.util.Scanner;

public class RC카 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int cs = 0 , m = 0; // cs : 현재속도 , m : 카의 이동거리
            for(int j = 0; j < n; j++){
                int rc = sc.nextInt(); // 0 : 현재속도유지 , 1 : 가속 , 2 : 감속

                if(rc == 0){
                    m += cs;
                }
                if(rc == 1){
                    int s = sc.nextInt(); // 가속??
                    cs += s;
                    m += cs;
                }
                if(rc == 2){
                    int s = sc.nextInt(); // 감속??
                    if(s > cs){
                        cs = 0;
                    }else{
                        cs -= s;
                    }
                    m += cs;
                }
            }
            System.out.println("#" + (i+1) + " " +m);
        }
    }
}
