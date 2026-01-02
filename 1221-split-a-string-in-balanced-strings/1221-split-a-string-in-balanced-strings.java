class Solution {
    public int balancedStringSplit(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        //String str="";
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') l++;
            else r++;
            if(l==r) count++;
        }
        return count;
        /*for(int i=0;i<s.length()-1;i++){
            if(map.get('R')==map.get('L')){
                if(s.charAt(i)!=s.charAt(i+1)){
                    str=s.substring(i+1);
                    count++;
                }
                else{
                    int charCountR=0;
                    int charCountL=0;
                    if(s.charAt(i)=='R' && s.charAt(i)==s.charAt(i+1)){
                        charCountR++;
                    }
                    else if(s.charAt(i)=='L'&& s.charAt(i)==s.charAt(i+1)){
                        charCountL++;
                    }
                    if(charCountR==charCountL){
                        str=s.substring(i+1);
                        count++;
                    }
                }
            }
        }*/
    }
}