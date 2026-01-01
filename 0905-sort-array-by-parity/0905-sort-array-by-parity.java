class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int num:nums){
            if(num%2==0) even.add(num);
            else odd.add(num);
        }
        List<Integer> res=new ArrayList<>();
        res.addAll(even);
        res.addAll(odd);
        int[] ans=new int[nums.length];
        for(int i=0;i<res.size();i++){
            ans[i]+=res.get(i);
        }
        return ans;
    }
}