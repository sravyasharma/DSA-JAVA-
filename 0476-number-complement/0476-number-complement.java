class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1') sb.append('0');
            else sb.append('1');
        }
        String s1=sb.toString();
        int num1=Integer.parseInt(s1,2);
        return num1;
    }
}