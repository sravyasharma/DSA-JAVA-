class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int prev=-1;
        for(int curr:map.values()){
            if(prev==-1) prev=curr;
            if(prev!=curr) return false;
        }
        return true;
    }
}