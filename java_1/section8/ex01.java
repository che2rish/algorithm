package section8;

import java.util.Scanner;

// 합이 같은 부분집합 (DFS : 아마존 인터뷰)
// 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 "YES"를 출력하고 그렇지 않으면 "NO"를 출력
public class ex01 {

    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false; // yes가 발견되면 그 다음 재귀들은 리턴시키려고??

    public void DFS(int L,int sum,int num[]){
        if(flag) return;
        if(sum > total/2) return;
        if(L==n){
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1,sum+num[L],num); // 포함시킨다.
            DFS(L+1,sum,num); // 포함시키지 않는다.
        }

    }
    public static void main(String[] args) {
        ex01 T = new ex01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n ; i++) {
            num[i] = sc.nextInt();
            total += num[i];
        }
        T.DFS(0,0,num);
        System.out.println(answer);
    }
}
