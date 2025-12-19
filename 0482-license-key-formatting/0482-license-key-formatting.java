class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='-'){
                sb.append(Character.toUpperCase(c));
            }
        }
        sb.reverse();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(count==k){
                res.append('-');
                count=0;
            }
            res.append(sb.charAt(i));
            count++;
        }
        return res.reverse().toString();
    }
}