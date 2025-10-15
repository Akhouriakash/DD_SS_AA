package Perfix_Sum;
import java.util.Scanner;

class EquilibriumPoint {

    public static int findEquilibrium(int[] arr){
        int totalSum = 0;
        for(int nums : arr)
            totalSum += nums;
         int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            int rightSum = totalSum - leftSum - arr[i];
            if( rightSum == leftSum)
                return i; // eq index
            leftSum += arr[i];
        }
            return -1; // not found
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int eqIndex = findEquilibrium(arr);
         if (eqIndex != -1)
            System.out.println("Equilibrium Index: " + eqIndex);
        else
            System.out.println("No Equilibrium Point Found");
    }
}
//   public static void main(String[] args) {
//         int[] arr = {1, 3, 5, 2, 2};
//         int eqIndex = findEquilibrium(arr);

//         if (eqIndex != -1)
//             System.out.println("Equilibrium Index: " + eqIndex);
//         else
//             System.out.println("No Equilibrium Point Found");
//     }