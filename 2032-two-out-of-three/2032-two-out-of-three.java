class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int num:nums2) set2.add(num);
        for(int num:nums3) set3.add(num);
        Set<Integer> wholeset=new HashSet<>();
        wholeset.addAll(set1);
        wholeset.addAll(set2);
        wholeset.addAll(set3);
        for(int num:wholeset){
            int c=0;
            if(set1.contains(num)) c++;
            if(set2.contains(num)) c++;
            if(set3.contains(num)) c++;
            if(c>=2) res.add(num);
            
        }
        return res;
    }
}