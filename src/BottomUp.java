import java.util.Scanner;

public class BottomUp {

    public static boolean canPartition(int[] nums) {
        int totalSum = 0;

        // Calculate the total sum of the array elements
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum is odd, it cannot be partitioned into two equal subsets
        if (totalSum % 2 != 0) {
            return false;
        }

        // Initialize an array to keep track of possible sums
        boolean[] possibleSums = new boolean[totalSum / 2 + 1];
        possibleSums[0] = true;

        // Iterate through the numbers
        for (int num : nums) {
            // Iterate through the possible sums in reverse
            for (int sumIndex = totalSum / 2 - num; sumIndex >= 0; sumIndex--) {
                if (possibleSums[sumIndex]) {
                    possibleSums[sumIndex + num] = true;
                }
            }
        }

        // The list can be partitioned into two subsets with equal sum
        // if possibleSums[half of total sum] is true.
        return possibleSums[totalSum / 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        // Check if it's possible to partition the array into two subsets with an equal sum
        System.out.println(canPartition(nums));
    }

}