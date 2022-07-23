package etc;

import java.util.Scanner;

public class 빗물트래핑 {
    public int trap(int[] height){
        int left = 0, right = height.length-1;
        int max_left = height[left];
        int max_right = height[right];
        int volume = 0;
        while(left <= right) {
            if (max_left < max_right) {
                max_left = Math.max(max_left,height[left]);
                volume +=  max_left - height[left];
                left++;
            } else {
                max_right = Math.max(max_right,height[right]);
                volume += max_right - height[right];
                right--;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        빗물트래핑 T = new 빗물트래핑();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.trap(arr));
    }

}

