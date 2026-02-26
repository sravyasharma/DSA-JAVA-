class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            boolean ok=true;
            int left=0,right=word.length()-1;
            while(left<right){
                if(word.charAt(left)!=word.charAt(right)){
                    ok=false;
                    break;
                }
                left++;
                right--;
            }
            if(ok) return word;
        }
        return "";
    }
}