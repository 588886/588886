class Solution {
    public int solution(int n) {
        int count=0;
		for(int i=2;i<=n;i++) {
			boolean primeNumber=true;
			for(int k=2;k<=(int)Math.sqrt(i);k++) {
				if(i%k==0) {
					primeNumber=false;
					break;
				}
			}
			if(primeNumber)count++;
		}
        return count;
    }
}