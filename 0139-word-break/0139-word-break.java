class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s==null) return false;
        int n=s.length();
        if(n==0) return true;
        Set<String> dict=new HashSet<>(wordDict);
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        int max=0;
        for(String w:dict){
            if(w.length()>max) max=w.length();
        }
        for(int i=1;i<=n;i++){
            for(int j=Math.max(0,i-max);j<i;j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}