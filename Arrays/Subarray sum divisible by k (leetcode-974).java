class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[k];
        int sum = 0;
        int count = 0;
        arr[0] = 1;
        for(int i : nums) {
            sum = (i+sum);
            int rem = sum % k;
            if(rem < 0) rem += k;
            count += arr[rem];
            arr[rem]++;
        }
        return count;
    }
}