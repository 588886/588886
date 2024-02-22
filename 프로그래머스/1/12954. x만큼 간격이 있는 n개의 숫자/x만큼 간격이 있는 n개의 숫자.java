class Solution {
    public long[] solution(int x, int n) {
        long[] result= new long[n];
        result[0]=x;
		for(int j=1;j<n;j++) {
			result[j]=(long)result[j-1]+result[0];
			
		}
        return result;
    }
}