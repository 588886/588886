
import java.math.BigInteger;

class Solution {
    public long solution(long n) {
        BigInteger bignum=BigInteger.valueOf(n).sqrt();
        
        return bignum.multiply(bignum).compareTo(BigInteger.valueOf(n))==0 ?
             BigInteger.valueOf(bignum.longValue()+1).multiply(BigInteger.valueOf(bignum.longValue()+1)).longValue() : -1;
    }
}