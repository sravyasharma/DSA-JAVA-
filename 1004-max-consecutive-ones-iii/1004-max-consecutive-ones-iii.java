class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,zc=0,max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) zc++;
            while(zc>k){
                if(nums[left]==0) zc--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}