class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0,diff=Integer.MAX_VALUE;
        for(l=0,r=k+1;r<n;){
            diff=Math.min(diff,Math.abs(nums[r++]-nums[l++]));
        }
        return diff!=Integer.MAX_VALUE?diff:0;
    }
}