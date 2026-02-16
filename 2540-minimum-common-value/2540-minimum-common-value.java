class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        /*Set<Integer> set=new HashSet<>();
        int min=0;
        for(int num:nums1) set.add(num);
        for(int num:nums2){
            if(set.contains(num)){
                min=Math.min(min,num);
            }
            else continue;
        }
        return min;*/
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<>();
        for(int num:nums1) set.add(num);
        for(int num:nums2) if(set.contains(num)) return num;
        return -1;
    }
}