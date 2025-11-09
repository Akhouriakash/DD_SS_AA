package KadaneAlgo;

import java.util.Scanner;

public class Kadane_Algorithm {

    //🧩 Problem: Maximum Subarray Sum (Kadane’s Algorithm)
    
    public static int kadaneAlgorithm(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // start with smallest possible number

        for (int num : nums) {
            currentSum += num; // step 1: add current element
            maxSum = Math.max(maxSum, currentSum); // step 2: update max if needed

            // step 3: reset if running sum becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum; // final maximum sum
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = kadaneAlgorithm(nums);
        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}
