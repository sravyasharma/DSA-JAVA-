class Solution {
    public char findTheDifference(String s, String t) {
        int[] chara=new int[26];
        for(char c:s.toCharArray()) chara[c-'a']++;
        for(char c:t.toCharArray()){
            if(--chara[c-'a'] < 0){
                return c;
            }
        }
        return ' ';
    }
}