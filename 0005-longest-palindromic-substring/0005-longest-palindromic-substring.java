class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(s.length()<=1) return s;

        int maxL=1;
        String maxStr=s.substring(0,1);
        for(int k=0;k<n;k++){
            for(int i=k+maxL;i<=n;i++){
                if(i-k>maxL && isPalindrome(s.substring(k,i))){
                    maxL=i-k;
                    maxStr=s.substring(k,i);
                }
            }
        }
        return maxStr;
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}