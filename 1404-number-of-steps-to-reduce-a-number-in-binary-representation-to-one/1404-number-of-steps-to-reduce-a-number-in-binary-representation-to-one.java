import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger num=new BigInteger(s,2);
        BigInteger zero=BigInteger.ZERO;
        BigInteger one=BigInteger.ONE;
        BigInteger two=new BigInteger("2");
        int count=0;
        while(num.compareTo(one)>0){
            num=num.mod(two).equals(zero)?num.divide(two):num.add(one);
            count++;
        }
        return count;
    }
}