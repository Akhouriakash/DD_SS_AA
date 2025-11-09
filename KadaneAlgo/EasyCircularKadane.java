package KadaneAlgo;
public class EasyCircularKadane {
    public static int maxCircularSubarraySum(int[] nums) {
        int totalSum = 0;
        int currMax = 0 , currMin = 0; 
        int maxSum = nums[0],minSum = nums[0];

        for(int num:nums){
            // Normal Kadane for max subarray
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

             // Reverse Kadane for min subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);


              // Keep total sum
            totalSum += num;
        }

          // If all numbers are negative, return maxSum (no circular needed)
        if (maxSum < 0) return maxSum;

        // Otherwise, take the max of normal and circular sums
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {3, -1, 2, -1};
        int result = maxCircularSubarraySum(nums);
        System.out.println("Maximum Circular Subarray Sum = " + result);
    }
}

/* 
✅ totalSum = 3
✅ maxSum = 4
✅ minSum = -1
✅ circularSum = totalSum - minSum = 3 - (-1) = 4

MaxCircularSum = max(NormalKadane, TotalSum - MinSubarraySum)

NormalKadane = Best sum without wrapping
TotalSum - MinSubarraySum = Best wrapping sum (we skip the worst part)
Because the biggest circular sum = “whole array” - “the worst part”.

*/