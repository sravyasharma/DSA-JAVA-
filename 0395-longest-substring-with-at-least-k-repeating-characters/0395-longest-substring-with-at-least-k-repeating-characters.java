class Solution {
    public int longestSubstring(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int maxL=Integer.MIN_VALUE;
        int n=s.length();
        if(n==0) return 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))<k){
                int left=longestSubstring(s.substring(0,i),k);
                int right=longestSubstring(s.substring(i+1),k);
                return Math.max(left,right);
            }
        }
        return n;
    }
}