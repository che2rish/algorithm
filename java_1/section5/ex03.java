package section5;

import java.util.Scanner;
import java.util.Stack;

// 크레인 인형뽑기 (카카오) - 게임 화면의 격자의 상태가 담긴 2차원 배열 board와
// 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
// 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수

public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int board[][] = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int moves[] = new int[m];

        for(int i = 0; i < m; i++){
            moves[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int count = 0;

        for(int x : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][x-1] != 0) {
                    if(!st.isEmpty()){
                        if(st.peek() == board[i][x-1]) {
                            st.pop();
                            count = count + 2;
                        }else st.push(board[i][x-1]);
                    }else{
                        st.push(board[i][x-1]);
                    }
                    board[i][x-1] = 0;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
