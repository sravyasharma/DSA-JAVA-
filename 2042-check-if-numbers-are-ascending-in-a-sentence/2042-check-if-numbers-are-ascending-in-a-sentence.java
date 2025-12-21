class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=-1;
        for(String word:s.split(" ")){
            if(Character.isDigit(word.charAt(0))){
                int curr=Integer.parseInt(word);
                if(curr<=prev) return false;
                prev=curr;
            }
        }
        return true;
    }
}