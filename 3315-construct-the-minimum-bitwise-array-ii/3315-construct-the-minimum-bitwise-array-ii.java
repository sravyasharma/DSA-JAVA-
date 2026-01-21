class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int val=nums.get(i);
            if(val!=2) ans[i]=val-((val+1) & (-val-1))/2;
            else ans[i]=-1;
        }
        return ans;
    }
}