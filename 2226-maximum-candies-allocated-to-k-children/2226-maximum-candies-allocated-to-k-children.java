/*class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=Arrays.stream(candies).max().getAsInt();
        int left=1;
        int right=max;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int candie:candies){
                count+=candie/mid;
            }
            if(count>=k){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}*/
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = Arrays.stream(candies).max().getAsInt();
        int left = 1, right = max;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;

            for (int c : candies) {
                count += c / mid;
            }

            if (count >= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
