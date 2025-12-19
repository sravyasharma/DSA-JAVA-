class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[58];
        for(char c:s.toCharArray()){
            arr[c-'A']++;
        }
        int count=0;
        for(int i=0;i<58;i++){
            count+=arr[i]/2*2;
            
        }
        return count==s.length()?count :count+1;
    }
}