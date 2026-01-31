class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int i=0;
        int currSum=0;
        for(int j=0;j<nums.length;j++){
            currSum+=nums[j];
            while(currSum>=target){
                if(j-i+1<min){
                    min=Math.min(min,j-i+1);
                }
                currSum-=nums[i];
                i++;
            }
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}