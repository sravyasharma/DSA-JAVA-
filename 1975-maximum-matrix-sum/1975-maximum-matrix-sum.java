class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res=0,tot=0;
        int neg=0;
        int minAbs=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int val=matrix[i][j];
                int valu=Math.abs(val);
                tot+=valu;
                if(val<0) neg++;
                minAbs=Math.min(minAbs,valu);
            }
        }
        if(neg%2==0) return tot;
        else return tot - 2 * minAbs;
    }
}