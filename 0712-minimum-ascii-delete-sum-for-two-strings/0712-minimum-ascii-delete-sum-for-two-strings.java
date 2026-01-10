class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int tot=0;
        int n1=s1.length(),n2=s2.length();
        for(int i=0;i<n1;i++) tot+=s1.charAt(i);
        for(int j=0;j<n2;j++) tot+=s2.charAt(j);
        int[][] dp=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    int asciival=(int)s1.charAt(i-1);
                    dp[i][j]=dp[i-1][j-1]+asciival;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return tot - 2*dp[n1][n2];
    }
}