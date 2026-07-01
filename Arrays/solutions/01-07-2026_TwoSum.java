/**
 * Problem: Two Sum
 * Source: LeetCode #1
 * Topic: Arrays / HashMap
 * Difficulty: Easy
 *
 * Approach:
 * Use a HashMap to store each number's index as we iterate.
 * For each element, check if (target - current) already exists in the map.
 * If yes, we found our pair in a single pass.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Notes / What I learned:
 * Brute force is O(n^2) with nested loops. The HashMap trick trades
 * space for time — a pattern that shows up constantly in array problems.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
