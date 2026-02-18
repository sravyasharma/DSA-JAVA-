class Solution {
    public boolean hasAlternatingBits(int n) {
        int x= n ^ (n>>1);
        return (x&(x+1)) == 0;
        /*String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;*/
    }
}