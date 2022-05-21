package sw;
/*
1288. 새로운 불면증 치료법
각 자리수에서 0에서 9까지의 모든 숫자를 보는 시점의 숫자 출력
N을 입력받고 N,2N,3N...으로 숫자를 증가
 */
import java.util.HashMap;
import java.util.Scanner;

public class 새로운불면증치료법 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int count = 0 , answer = 0;
            int n = sc.nextInt();
            HashMap<Integer,Integer> hm = new HashMap<>();
            while(hm.size() < 10){
                int num = n * (++count);
                answer = num;
                while(num > 0){
                    hm.put(num%10,hm.getOrDefault(num%10,0)+1);
                    num /= 10;
                }
            }
            System.out.println("#" + (i+1) + " " + answer);
        }
    }
}
