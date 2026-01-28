class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char[] chars=s.toCharArray();
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]) return false;
        }
        return true;
    }
}