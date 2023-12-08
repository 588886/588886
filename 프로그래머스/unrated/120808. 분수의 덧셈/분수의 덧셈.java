class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int de=0;
		for(int i=1;i<1000000;i++) {
			if((i%denom1==0)&&(i%denom2==0)) {
				de=i;
				break;
			}
		}
		
		int num=(numer1*de/denom1)+(numer2*de/denom2);
		
		for(int i=1;i<=de;i++) {
			
			if((num%i==0)&&(de%i==0)){
				num/=i;
				de/=i;
				i=1;
			}
			
		}
		
		int[] answer= {num,de};
        return answer;
    }
}