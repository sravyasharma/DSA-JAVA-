class Solution {
    public String largestNumber(int[] nums) {
        String[] chars=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            chars[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(chars,(a,b)->(b+a).compareTo(a+b));
        if(chars[0].charAt(0)=='0') return "0";
        StringBuilder sb=new StringBuilder();
        for(String s:chars) sb.append(s);
        return sb.toString();
    }
}