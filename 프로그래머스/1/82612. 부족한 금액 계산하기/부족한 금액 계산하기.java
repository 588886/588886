class Solution {
    public long solution(int price, int money, int count) {
        long sum=count;
		for(int i=1;i<count;i++) {
			sum+=i;
		}
        
        return (long)(sum*price)-money<0 ? 0:(long)(sum*price)-money;
    }
}