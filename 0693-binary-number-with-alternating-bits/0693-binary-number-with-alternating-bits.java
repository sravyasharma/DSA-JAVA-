class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]) return false;
        }
        return true;
    }
}