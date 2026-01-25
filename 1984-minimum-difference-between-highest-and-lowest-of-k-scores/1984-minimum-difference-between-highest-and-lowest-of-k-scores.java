class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int l=0, r=k-1;r<n;){
            diff=Math.min(diff,nums[r++]-nums[l++]);
        }
        return diff;
    }
}