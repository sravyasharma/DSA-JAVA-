class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        int n=nums.size();
        for(int k=0;k<n;k++){
            int sum=0;
            for(int i=k;i<n;i++){
                sum+=nums.get(i);
                int len=i-k+1;

                if(len>=l && len<=r && sum>0){
                    min=Math.min(min,sum);
                }

                if(len>r) break;
            }
        }
        return min!=Integer.MAX_VALUE?min:-1;
    }
}