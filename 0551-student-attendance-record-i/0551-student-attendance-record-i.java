class Solution {
    public boolean checkRecord(String s) {
        int countL=0, countA=0;
        for(char c:s.toCharArray()){
            if(c!='L') countL=0;
            if(c=='L') countL++;
            if(c=='A') countA++;
            if(countL==3 || countA==2) return false;
        }
        return true;
    }
}