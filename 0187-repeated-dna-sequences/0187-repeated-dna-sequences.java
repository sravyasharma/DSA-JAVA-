class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set=new HashSet<>();
        Set<String> set1=new HashSet<>();
        for(int i=0;i+9<s.length();i++){
            String ten=s.substring(i,i+10);
            if(!set.add(ten)) set1.add(ten);
        }
        return new ArrayList(set1);
    }
}