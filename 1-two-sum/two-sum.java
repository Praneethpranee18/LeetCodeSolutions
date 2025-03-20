import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // If found, return the indices
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found (though the problem guarantees one solution), return null or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");  // Output: [0, 1]
        
        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");  // Output: [1, 2]
        
        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");  // Output: [0, 1]
    }
}
