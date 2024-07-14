class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet(); // Create a HashSet to store the integers seen so far
        for (int i = 0; i < nums.length; i++) { // Iterate through the array
            if (set.contains(nums[i])) { // Check if the current number is already in the set
                return nums[i]; // If it is, return it as the duplicate
            }
            set.add(nums[i]); // Otherwise, add the current number to the set
        }
        return -1; // Return -1 if no duplicate is found (this line is actually redundant in this context as the problem guarantees a duplicate)
    }
}
