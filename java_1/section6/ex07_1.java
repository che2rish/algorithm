package section6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 좌표를 저장하는 클래스
// Comparable이라는 인터페이스의 구현 클래스
class Point implements Comparable<Point>{
    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // 재정의
    @Override
    public int compareTo(Point o) {
        // this객체가 앞에 있고 매개변수로 넘어온 객체가 뒤 => 음수 리턴 (this.y-o.y) , 오름차순
        // 내림차순으로 하려면 o.y-this.y
        if(this.x == o.x) return this.y-o.y; // 오름차순 정렬
        else return this.x- o.x;
    }
}
public class ex07_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y)); // 객체 생성
        }

        Collections.sort(arr); // sort가 호출되면 Comparable 인터페이스를 통해서 Point 객체 정렬
        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}
