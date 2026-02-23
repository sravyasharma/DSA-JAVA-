class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }

        /*int first=nums[0],second=nums[1];
        if(nums.length<3) return Math.max(first,second);
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2!=0) sum+=nums[i];
            else continue;
        }
        return sum;*/
        return dp[n-1];
    }
}