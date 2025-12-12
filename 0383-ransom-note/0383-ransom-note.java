class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] charac=new int[26];
        for(char c:magazine.toCharArray()){
            charac[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(charac[c-'a']<=0) return false;
            charac[c-'a']--;
        }
        return true;
    }
}