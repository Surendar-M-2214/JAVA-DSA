package Leetcode_75;

import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
      rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rever(nums,0,n-1);
        rever(nums,0,k-1);
        rever(nums,k,n-1);

    }
    public static void rever(int[] nums, int s, int e) {

        while (s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

    }
}
