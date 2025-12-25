class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Set<Character> set=new HashSet<>();
        for(char c:word1.toCharArray()) set.add(c);
        for(char word:word2.toCharArray()) set.add(word);
        for(char c:set){
            int c1=0,c2=0;
            for(char x:word1.toCharArray()) if(x==c) c1++;
            for(char x:word2.toCharArray()) if(x==c) c2++;
            if(Math.abs(c1-c2)>3) return false;
        }
        return true;
    }
}