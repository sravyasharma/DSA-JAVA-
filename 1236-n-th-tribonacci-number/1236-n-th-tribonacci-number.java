import java.math.BigInteger;
class Solution {
    public int tribonacci(int n) {
        BigInteger n1=BigInteger.ZERO;
        BigInteger n2=BigInteger.ONE;
        BigInteger n3=BigInteger.ONE;
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            BigInteger temp=n1.add(n2).add(n3);
            n1=n2;
            n2=n3;
            n3=temp;
        }
        return n3.intValue();
    }
}