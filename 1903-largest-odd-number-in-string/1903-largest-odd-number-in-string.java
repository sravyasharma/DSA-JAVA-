class Solution {
    public String largestOddNumber(String num) {
        String res="";
        for(int i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if(Character.getNumericValue(c)%2!=0) return num.substring(0,i+1);
        }
        return res;
    }
}