class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1 &&!set.contains(n)){
            set.add(n);
            int temp=n;
            int sum=0;
            while(temp>0){
                int dig=temp%10;
                sum+=dig*dig;
                temp/=10;
            }
            n=sum;
        }
        return n==1;
    }
}