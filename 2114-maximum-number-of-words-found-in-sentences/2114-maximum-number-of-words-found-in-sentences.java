class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(String sent:sentences){
            int size=sent.split(" ").length;
            if(size>max){
                max=size;
            }
        }
        return max;
    }
}