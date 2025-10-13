
// pivotIndexefix Sum & Cumulative Sum Approach : Prefix Sum means precomputing cumulative sums of array elements to quickly answer range sum or difference-related queries.

/* 💡 Trick to Identify Prefix Sum Questions

If the question involves:
“Sum of subarray”

“Range sum queries”

“Equal partition of array”

“Balance point / pivot index”
then prefix sum or cumulative approach usually works. */

//  Leetcode #724 Find Pivot Index

// Given an array of integers, find an index i such that the sum of numbers to the left of i equals the sum to the right of i.

/*🧩 Logic / Algorithm

Calculate total sum of the array.

Traverse the array keeping track of leftSum.

For each element, check if
leftSum == totalSum - leftSum - currentElement

If yes → return index. */

import java.util.Scanner;
import java.util.*;

class pivotInd{

public static int pivotIndex(int[] nums){
    int totalsum = 0;

    for(int num : nums)
        totalsum += num;
    
    int leftsum = 0;
    for(int i=0;i<nums.length;i++){
        if(leftsum == totalsum - leftsum - nums[i])
            return i;
        leftsum += nums[i];
    }
    return -1;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of array: ");
    for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();

    int result =pivotIndex(arr);
    System.out.println("PIVOT INDEX : "+ result);

}
}