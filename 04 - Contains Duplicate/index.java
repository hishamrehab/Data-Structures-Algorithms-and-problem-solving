class Solution {
    public boolean containsDuplicate(int[] nums) {
     // Create a HashSet to store elements fromy the array 
     HashSet<Integer> seenNumbers = new HashSet<>();
 
    // Iterate through each element in the array
    for(int num : nums) {
        // Check if the element is already in the HashSet
        if(seenNumbers.contains(num)) {
            return true; //Duplicate found
        }
        seenNumbers.add(num);
    }
        return false; // No dublicates found
    
    }
}