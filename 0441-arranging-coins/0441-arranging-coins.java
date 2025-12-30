/*class Solution {
    public int arrangeCoins(int n) {
        /*int left=1;
        int right=n;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int coins=(mid*(mid+1))/2;
            if(coins==n) ans=(int) mid;
            else if(coins<n){
                ans=(int)mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
        
    }
}*/
class Solution {
    public int arrangeCoins(int n) {
        long left=1, right=n;int res=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            long coins=mid*(mid+1)/2;
            if(coins==n){
                return (int)mid;
            }
            else if(coins<n){
                res=(int)mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return res;
    }
}