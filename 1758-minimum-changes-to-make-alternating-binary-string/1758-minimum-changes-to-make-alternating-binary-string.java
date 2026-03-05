class Solution {
    public int minOperations(String s) {
        int curr1=0,curr2=0;
        for(int i=0;i<s.length();i++){
            int exp1=(i%2==0)?'1':'0';
            int exp2=(i%2==0)?'0':'1';


            if(s.charAt(i)!=exp1) curr1++;
            if(s.charAt(i)!=exp2) curr2++;
        }
        return Math.min(curr1,curr2);
    }
}