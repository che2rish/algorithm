package programmers;

import java.util.*;

// 정수 내림차순으로 배치하기 - 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 정수를 리턴
public class ex04 {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n /= 10;
        }
        Collections.sort(arr);
        String str = "";
        for(int i = arr.size()-1; i >= 0; i--){
            str += arr.get(i);
        }
        // System.out.println(str);
        answer = Long.parseLong(str);
        return answer;
    }

    public static void main(String[] args) {
        ex04 T = new ex04();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(T.solution(n));
    }
}
