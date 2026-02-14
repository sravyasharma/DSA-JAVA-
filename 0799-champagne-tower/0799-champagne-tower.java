class Solution {
    public double champagneTower(int poured, int r, int c) {
        double[][] dp = new double[r+1][r+1];
        dp[0][0]=poured;
        double of;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                of = Math.max(0, dp[i][j] - 1);
                dp[i+1][j] += of / 2;
                dp[i+1][j+1] += of / 2;
            }
        }

        return Math.min(1, dp[r][c]);
    }
}