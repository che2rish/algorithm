package section2;

import java.util.Scanner;

public class ex10_1 {
    // main에서 접근할 일이 없어서(solution에서만 접근) static으로 안해도 됨
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    public int solution(int n, int[][] arr){
        int answer = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean flag = true; // 봉우리인지 판별해주는 변수

                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k]; // 행 좌표
                    int ny = j + dy[k]; // 열 좌표

                    // 경계선 바깥쪽을 못보게 하려고..?? -> 먼저 봐야하므로 앞으로 와야함 (nx>=0 && nx<n && ny>=0 && ny<n &&)
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break; // 만약에 false가 하나라도 나오면 더이상 확인하지 않아도 됨
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        ex10_1 T = new ex10_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}
