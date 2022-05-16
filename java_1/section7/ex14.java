package section7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리 (BFS) - 1번 정점에서 각 정점으로 가는 최소 이동 간선수
public class ex14 {

    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()){
            int cv = q.poll(); // 현재 정점
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        ex14 T = new ex14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        dis = new int[n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}
