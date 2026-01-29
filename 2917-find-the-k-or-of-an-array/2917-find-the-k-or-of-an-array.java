class Solution {
    public int findKOr(int[] nums, int k) {
        StringBuilder sb=new StringBuilder();
        for(int b=30;b>=0;b--){
            int count=0;
            for(int num:nums){
                if(((num>>b)&1)==1) count++;
            }
            if(count>=k) sb.append('1');
            else sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}