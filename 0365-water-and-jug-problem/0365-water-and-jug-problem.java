class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        int l=gcd(x,y);
        if(x+y<target) return false;
        return target%l==0;
    }
    public static int gcd(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
}