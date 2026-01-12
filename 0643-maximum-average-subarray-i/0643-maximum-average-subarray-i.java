class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double CurrSum=0;
        for(int i=0;i<k;i++){
            CurrSum+=nums[i];
        }
        double maxSum=CurrSum;
        double maxAvg=Integer.MIN_VALUE;
        for(int i=k;i<n;i++){
            CurrSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,CurrSum);
        }
        maxAvg=maxSum/k;
        return maxAvg;
    }
}