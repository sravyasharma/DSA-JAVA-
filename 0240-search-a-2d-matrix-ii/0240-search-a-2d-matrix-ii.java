class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;
        int n=matrix[0].length-1;
        /*for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;*/
        while(n>=0 && m<matrix.length){
            if(matrix[m][n]==target) return true;
            else if(matrix[m][n]>target) n--;
            else m++;
        }
        return false;
    }
}