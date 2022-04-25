package section7;

public class ex04_2 {
    static int[] fibo;

    public int DFS(int n){
        if(n==1) return fibo[n] =  1;
        else if(n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        ex04_2 T = new ex04_2();
        int n = 10;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
