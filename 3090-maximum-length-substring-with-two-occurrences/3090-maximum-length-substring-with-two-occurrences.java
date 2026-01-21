class Solution {
    public int maximumLengthSubstring(String s) {
        char[] chars=s.toCharArray();
        int j=0,ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
           map.put(chars[i],map.getOrDefault(chars[i],0)+1);
           while(map.get(chars[i])>2){
            char c=chars[j++];
            map.put(c,map.get(c)-1);
           }
           ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}