package section7;

public class ex04_1 {
    public int DFS(int n){
        if(n==1) return 1;
        else if(n == 2) return 1;
        else return DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        ex04_1 T = new ex04_1();
        int n = 10;
        for(int i = 1; i <= n; i++) System.out.print(T.DFS(i) + " ");
    }
}
