class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Initialize the first pointer
        
        // Traverse through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous unique element
            if (nums[j] != nums[i]) {
                i++; // Move the first pointer
                nums[i] = nums[j]; // Update the element at the new position
            }
        }
        
        // Return the length of the array without duplicates
        return i + 1;
    }
}