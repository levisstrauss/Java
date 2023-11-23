import java.util.Scanner;

public class TopDown {

    private static boolean[][] memo;

    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        memo = new boolean[nums.length][totalSum / 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < totalSum / 2 + 1; j++) {
                memo[i][j] = false; // Initialize memoization matrix
            }
        }

        return canPartitionRecursive(nums, totalSum / 2, 0);
    }

    private static boolean canPartitionRecursive(int[] nums, int sum, int currentIndex) {
        // Base cases
        if (sum == 0) {
            return true;
        }

        if (currentIndex >= nums.length || sum < 0) {
            return false;
        }

        // If already computed, return the value from the memo table
        if (memo[currentIndex][sum]) {
            return memo[currentIndex][sum];
        }

        // Recursive call after choosing the number at the currentIndex
        // If the number at currentIndex exceeds the sum, we shouldn't process this
        if (nums[currentIndex] <= sum) {
            if (canPartitionRecursive(nums, sum - nums[currentIndex], currentIndex + 1)) {
                memo[currentIndex][sum] = true;
                return true;
            }
        }

        // Recursive call without choosing the number at the currentIndex
        memo[currentIndex][sum] = canPartitionRecursive(nums, sum, currentIndex + 1);

        return memo[currentIndex][sum];
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