class Solution {
    public int maxPower(String s) {
        int max=1,pow=1;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                max++;
            }
            else{
                if(max>pow){
                    pow=max;
                }
                max=1;
            }
        }
        return max>pow?max:pow;
    }
}