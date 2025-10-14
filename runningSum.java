// Running Sum of 1D Array  LeetCode #1480 | Easy
/*Given an array nums,
return the running sum of nums.

The running sum is defined as:
runningSum[i] = sum(nums[0] + nums[1] + ... + nums[i]) */

/*🧠 Logic

We’ll use prefix sum idea:

Start with the first element (it remains same).

Add the previous sum to current element.

Keep updating as you go.

So for each index i (from 1 to n-1):
👉 nums[i] = nums[i] + nums[i-1]; */

import java.util.Scanner;

public class runningSum {
    
    public static int[] runningSum_1d(int[] nums){
        for(int i=1;i<nums.length;i++){
         nums[i] += nums[i-1];
        }
        return nums;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int[] result = runningSum_1d(arr);
        for(int nums : result)
        System.out.print(nums + " ");
    }
}

