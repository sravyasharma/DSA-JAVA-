class Solution {
    public int countGoodSubstrings(String s) {
        char[] chars=s.toCharArray();
        int n=chars.length;
        int c=0,k=3;
        if(n<k) return 0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        } 
        if(map.size()==k) c++;
        for(int i=k;i<n;i++){
            map.put(chars[i-k],map.get(chars[i-k])-1);
            if(map.get(chars[i-k])==0) map.remove(chars[i-k]);
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
            if(map.size()==k) c++;
        }
        return c;
    }
}