class Solution {
    public boolean checkDistances(String s, int[] distance) {
            Map<Character,Integer>map=new HashMap<>();
            char[] arr=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    int start=map.get(arr[i]);
                    int diff=i-start-1;
                    if(distance[arr[i]-'a']!=diff) return false;
                }
                else{
                    map.put(arr[i],i);
                }
            }
        return true;    
    }
}