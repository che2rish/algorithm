package section7;

import java.util.ArrayList;
import java.util.Scanner;

// 경로 탐색(인접리스트) - 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수 출력
public class ex13 {

    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int i = 0; i < graph.get(v).size(); i++){

                if(ch[graph.get(v).get(i)] == 0){
                    ch[graph.get(v).get(i)] = 1;
                    DFS(graph.get(v).get(i));
                    ch[graph.get(v).get(i)] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        ex13 T = new ex13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){ // 객체생성 0,1,2,3,4,5
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b); // a번 ArrayList에 접근
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
