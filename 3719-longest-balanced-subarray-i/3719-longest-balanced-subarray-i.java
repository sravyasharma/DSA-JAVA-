class Solution {
    public int longestBalanced(int[] nums) {
        int maxL=0;
        int n=nums.length;
        for(int k=0;k<n;k++){
            Set<Integer> even=new HashSet<>();
            Set<Integer> odd=new HashSet<>();
            for(int i=k;i<n;i++){
            if(nums[i]%2==0) even.add(nums[i]);
            else odd.add(nums[i]);

            if(even.size()==odd.size()) maxL=Math.max(maxL,i-k+1);
            }
        }
        return maxL;
    }
}