package section4;

import java.util.HashMap;
import java.util.Scanner;

// 학급 회장(해쉬) - 어떤 기호의 후보가 학급회장이 되었는지 출력
public class ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int max = 0;
        char ch = ' ';

        HashMap<Character,Integer> student = new HashMap<>();

        for(int i = 0; i < n; i++){
            student.put(str.charAt(i), student.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i = 0; i < n; i++) {
            if (max < student.get(str.charAt(i))){
                max = student.get(str.charAt(i));
                ch = str.charAt(i);
            }
        }
        System.out.println(ch);


    }
}
