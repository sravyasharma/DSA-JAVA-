class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int diff=nums[i+1]-nums[i];
            max=Math.max(max,diff);
        }
        return max!=Integer.MIN_VALUE?max:0;
    }
}