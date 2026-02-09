class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length,c=0;
        if(n<3) return 0;
        for(int k=3;k<=n;k++){
            for(int j=0;j+k<=n;j++){
                int diff=nums[j+1]-nums[j];
                boolean isArth=true;
                for(int x=j+2;x<j+k;x++){
                    if(nums[x]-nums[x-1]!=diff){
                        isArth=false;
                        break;
                    }
                }
                if(isArth) c++;
            }
        }
        return c;
    }
}