class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int idx=0;
        for(int c=0;c<3;c++){
            int freq=map.get(c);
            for(int j=0;j<freq;j++){
                nums[idx]=c;
                idx++;
            }
        }
    }
}