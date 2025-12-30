class Solution {
    public int arrangeCoins(int n) {
        int left=1;
        int right=n;
        int ans=0;
        while(left<right){
            int mid=left+(right-left)/2;
            int coins=(mid*(mid+1))/2;
            if(coins<=n){
                ans=(int)mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return (int)left;
    }
}