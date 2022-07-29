package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 1316. 그룹 단어 체커
public class 그룹단어체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<Character>arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            arr.add(str.charAt(0));
            int k = 0, num=0;
            for (int j = 1; j <str.length() ; j++) {
                if(arr.get(k) != str.charAt(j)) {
                    arr.add(str.charAt(j));
                    for(int l = 0; l < arr.size()-1; l++){
                        if(arr.get(l) == str.charAt(j)) num++;
                    }
                    k++;
                }
            }
            if(num == 0) count++;
            arr.clear();
        }
        System.out.println(count);
    }
}
