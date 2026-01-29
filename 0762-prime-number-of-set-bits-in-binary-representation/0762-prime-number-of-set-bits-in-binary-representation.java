class Solution {
    public int countPrimeSetBits(int left, int right) {
        int PrimeCount=0;
        for(int i=left;i<=right;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                count+=(temp&1);
                temp>>=1;
            }
            if(isPrime(count)) PrimeCount++;
        }
        return PrimeCount;
    }
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true; 
    }
}