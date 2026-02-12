class Solution {
    public int longestBalanced(String s) {
        int n=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.clear();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);

                int cnt=map.get(c);
                boolean equal=true;

                for(int count:map.values()){
                    if(count!=cnt){
                        equal=false;
                        break;
                    }
                }
                if(equal){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}