class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the complement
            int complement = target - nums[i];

            // check If complement exists, return indices
            if (map.containsKey(complement)) {
                // If found , return the indices of the component and the current number
                return new int[]{ map.get(complement), i };
            }

            // Otherwise, add the current number with its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found 
        return new int[]{};
    }
}