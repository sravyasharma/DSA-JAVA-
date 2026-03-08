class Solution {
    public int maxLength(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            long lcm=1,gcd=0,prod=1;
            for(int j=i;j<nums.length;j++){
                prod= prod*nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                if(prod==(lcm*gcd)) max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
    private long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    private long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}