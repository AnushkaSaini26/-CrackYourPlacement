class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;
        
        for (int num : nums) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
            if (counts.get(num) > n / 2) {
                return num;
            }
        }
        return -1; 
    }
}