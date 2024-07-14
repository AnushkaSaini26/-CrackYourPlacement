class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums); // Sort the array
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { // Found a duplicate
                if (!result.contains(nums[i])) { // Add to result if not already added
                    result.add(nums[i]);
                }
            }
        }
        
        return result;
    }
}