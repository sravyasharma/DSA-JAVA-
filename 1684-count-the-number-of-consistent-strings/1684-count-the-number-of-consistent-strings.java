class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(Character c:allowed.toCharArray()){
            set.add(c);
        }
        for(String word:words){
            boolean ok=true;
            for(int i=0;i<word.length();i++){
                if(!set.contains(word.charAt(i))){
                    ok=false;
                    break;
                }
            }
            if(ok) count++;
        }
        return count;
    }
}