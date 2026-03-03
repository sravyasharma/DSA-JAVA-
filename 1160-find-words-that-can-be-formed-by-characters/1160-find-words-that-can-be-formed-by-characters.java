class Solution {
    int[] charfreq=new int[26];
    public int countCharacters(String[] words, String chars) {
        int count=0;
        for(char c:chars.toCharArray()) charfreq[c-'a']++;
        for(String word:words){
            if(isGood(word)) count+=word.length();
        }
        return count;
    }
    public boolean isGood(String word){
        int[] localfreq=new int[26];
        for(char c:word.toCharArray()) localfreq[c-'a']++;
        for(int i=0;i<26;i++) if(localfreq[i]>charfreq[i]) return false;

        return true;
    }
}