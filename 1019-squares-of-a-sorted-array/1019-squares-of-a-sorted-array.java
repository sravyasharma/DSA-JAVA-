class Solution {
    public int[] sortedSquares(int[] nums) {
        /*return Arrays.stream(nums).map(x->x*x).sorted().toArray();*/
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}