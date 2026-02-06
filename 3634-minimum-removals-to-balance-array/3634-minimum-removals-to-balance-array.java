class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxL=0,i=0;
        for(int j=0;j<nums.length;j++){
            while((long)nums[j]>(long)nums[i]*k){
                i++;
            }
            maxL=Math.max(maxL,j-i+1);
        }
        return nums.length-maxL;
    }
}