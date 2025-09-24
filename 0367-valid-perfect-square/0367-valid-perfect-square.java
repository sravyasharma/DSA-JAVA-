class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int left=1,right=46340;
        while(left<=right){
            int mid=left+(right-left)/2;
            int square=mid*mid;
            if(square==num){
                return true;
            }
            else if(square<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}