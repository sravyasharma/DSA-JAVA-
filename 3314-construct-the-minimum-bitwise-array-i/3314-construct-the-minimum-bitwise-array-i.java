class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int x=nums.get(i);
            if((x & 1)==1) ans[i]=x & ~(((x+1)&~x)>>1);
            else ans[i]=-1;
        }
        return ans;
    }
}