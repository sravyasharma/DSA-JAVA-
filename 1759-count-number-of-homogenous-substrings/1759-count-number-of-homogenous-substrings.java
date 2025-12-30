class Solution {
    public int countHomogenous(String s) {
        int mod=1000000007;
        int tot=0,curr=0;
        for(int i=0;i<s.length();i++){
            curr=(i>0 && s.charAt(i)==s.charAt(i-1))?curr+=1:1;
            tot=(tot+curr)%mod;
        }
        return (int)tot;
    }
}