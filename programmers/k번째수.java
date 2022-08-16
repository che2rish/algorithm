package programmers;

import java.util.Arrays;
import java.util.Scanner;

// K번째수 - 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수 구하기
public class k번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int n = commands[i][0]-1;
            int m = commands[i][1]-1;
            int[] arr = new int[m-n+1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = array[n++];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        k번째수 T = new k번째수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] commands = new int[m][3];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < 3; j++) {
                commands[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(T.solution(arr,commands)));
    }
}
