class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0) return res;

        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");


        backtrack(digits,0,new StringBuilder(), res, map);
        return res;
    }
    private void backtrack(String digits,int idx,StringBuilder comp,List<String> res,Map<Character,String> map){
        if(idx==digits.length()){
            res.add(comp.toString());
            return;
        }
        String letters=map.get(digits.charAt(idx));
        for(char l:letters.toCharArray()){
            comp.append(l);
            backtrack(digits,idx+1,comp,res,map);
            comp.deleteCharAt(comp.length()-1);
        }
    }
}