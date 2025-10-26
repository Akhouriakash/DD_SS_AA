package Perfix_Sum;
// Range Sum Query (Immutable) – LeetCode #303

import java.util.Scanner;

public class NumArray {
    int[] prefix;  // 👈 Array to store prefix sums

    // 🧩 Constructor: builds the prefix sum array
    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1]; // extra space for 0-based handling
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    // ⚙️ Returns the sum of elements from index 'left' to 'right' (inclusive)
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    // 🌟 Main function to take user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Create NumArray object
        NumArray obj = new NumArray(nums);

        // Step 4: Allow multiple range queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.print("Enter left and right indices (space-separated): ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            int result = obj.sumRange(left, right);
            System.out.println("Sum from index " + left + " to " + right + " = " + result);
        }

        sc.close();
    }
}
