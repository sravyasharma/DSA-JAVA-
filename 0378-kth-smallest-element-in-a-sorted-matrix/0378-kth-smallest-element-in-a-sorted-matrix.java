class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int left=matrix[0][0];
        int right=matrix[m-1][m-1];
        while(left<right){
            int mid=left+(right-left)/2;
            int count=0;
            int row=m-1,col=0;
            while(row>=0 && col<m){
                if(matrix[row][col]<=mid){
                    count+= row+1;
                    col++;
                }
                else{
                    row--;
                }
            }
            if(count<k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}