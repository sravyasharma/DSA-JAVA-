class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int max=0,j=0,res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            max=Math.max(max,map.get(c));

            while((i-j+1)-max>k){
                char left=s.charAt(j);
                map.put(left,map.get(left)-1);
                j++;
            }
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}