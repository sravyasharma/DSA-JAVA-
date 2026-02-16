class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        for(int l=0,r=k-1;r<n;){
            diff=Math.min(diff,Math.abs(nums[r++]-nums[l++]));
        }
        return diff;
    }
}