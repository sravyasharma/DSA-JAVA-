class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c=='+' || c=='-' ||c=='*'){
                String left=exp.substring(0,i);
                String right=exp.substring(i+1);

                List<Integer> LeftSub=diffWaysToCompute(left);
                List<Integer> RightSub=diffWaysToCompute(right);

                for(int l:LeftSub){
                    for(int r:RightSub){
                        if(c=='+'){
                            res.add(l+r);
                        }
                        else if(c=='-'){
                            res.add(l-r);
                        }
                        else if(c=='*'){
                            res.add(l*r);
                        }
                    }
                }
            }
        }
        if(res.isEmpty()){
            res.add(Integer.parseInt(exp));
        }
        Collections.sort(res);
        return res;
    }
}