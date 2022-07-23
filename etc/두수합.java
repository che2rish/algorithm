package etc;

import java.util.Arrays;
import java.util.Scanner;

public class 두수합 {
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]+nums[i+1] == target){
                answer[0] = i;
                answer[1] = i+1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        두수합 T = new 두수합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(T.twoSum(nums,target)));
    }
}

