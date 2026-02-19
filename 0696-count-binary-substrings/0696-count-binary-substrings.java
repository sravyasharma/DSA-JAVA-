class Solution {
    public int countBinarySubstrings(String s) {
        int res=0,strk=1,prev=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) strk++;
            else{
                prev=strk;
                strk=1;
            }
            if(prev>=strk) res++;
        }
        return res;
    }
}