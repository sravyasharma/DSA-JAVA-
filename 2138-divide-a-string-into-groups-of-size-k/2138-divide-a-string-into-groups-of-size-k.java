class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res=new ArrayList<>();
        while(s.length()%k!=0) s+=fill;

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(sb.length()==k){
                res.add(sb.toString());
                sb=new StringBuilder();
            }
        }
        return res.toArray(new String[0]);
    }
}