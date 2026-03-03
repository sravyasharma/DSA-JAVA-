class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0");

        for(int i=2;i<=n;i++){
            StringBuilder invert=new StringBuilder();
            for(int j=0;j<s.length();j++){
                invert.append(s.charAt(j)=='0'?'1':'0');
            }
            invert.reverse();
            s.append("1").append(invert);
        }
        return s.charAt(k-1);
    }
}