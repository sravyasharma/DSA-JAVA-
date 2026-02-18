class Solution {
    public boolean hasAlternatingBits(int n) {
        /*int x= n ^ (n>>1);
        return (x&(x+1)) == 0;*/
        /*String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;*/
        while(n>1){
            int x=(n&1) ^ ((n>>1)&1);
            if(x==0) return false;
            n>>=1;
        }
        return true;
    }
}