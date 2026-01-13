class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) res.add(i);
            else continue;
        }
        return res;
    }
}