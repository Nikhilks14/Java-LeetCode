class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxsum = nums[0];
        
        
        int n = nums.length;
        for(int i=1; i<n; i++){
            sum = Math.max(nums[i], nums[i] + sum);
            maxsum = Math.max(sum, maxsum);
        }

        return maxsum;
    }
}   