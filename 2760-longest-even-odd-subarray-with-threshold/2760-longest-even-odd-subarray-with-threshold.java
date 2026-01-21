class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n=nums.length;
        int i=0,maxL=0;
        while(i<n){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int start=i;
                i++;
                while(i<n && nums[i]<=threshold && nums[i]%2 != nums[i-1]%2) i++;
                maxL=Math.max(maxL,i-start);
            }
            else i++;
        }
        return maxL;
    }
}