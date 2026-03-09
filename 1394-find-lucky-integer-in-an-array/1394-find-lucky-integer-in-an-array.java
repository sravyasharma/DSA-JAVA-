class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int num:arr){
            if(num==map.get(num)){
                max=Math.max(max,num);
            }
            else continue;
        }
        return max==0?-1:max;
    }
}