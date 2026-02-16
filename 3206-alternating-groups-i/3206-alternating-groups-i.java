class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
       int co=0;
       int n=colors.length;
       for(int i=0;i<colors.length;i++){
        int a=colors[i];
        int b=colors[(i+1)%n];
        int c=colors[(i+2)%n];

        if(a!=b && b!=c) co++;
       }
       return co;
    }
}