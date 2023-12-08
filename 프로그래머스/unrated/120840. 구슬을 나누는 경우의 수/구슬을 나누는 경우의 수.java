
import java.math.BigInteger;
class Solution {
    public int solution(int m, int n) {
        return Integer.parseInt(fac(m,n));
    }
    String fac(int x,int y) {
		String n="1";
		BigInteger bt=new BigInteger(n);
		for (int i=1;i<=x;i++) {
			bt=bt.multiply(new BigInteger(i+""));
		}
		for (int i=1;i<=x-y;i++) {
			bt=bt.divide(new BigInteger(i+""));
		}
		for (int i=1;i<=y;i++) {
			bt=bt.divide(new BigInteger(i+""));
		}
		
		return bt.toString();
	}
}