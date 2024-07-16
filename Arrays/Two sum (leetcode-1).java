class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[2];
        for (int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if (mp.containsKey(c) &&  mp.get(c)!=i){
                ans[0]=i;
                ans[1]=mp.get(c);
                return ans;
            }
            mp.put(nums[i],i);
        }
        return new  int [] {};
    }
}