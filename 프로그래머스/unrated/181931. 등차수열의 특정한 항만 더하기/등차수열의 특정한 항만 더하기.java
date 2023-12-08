class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] includedInt=new int[included.length];
    	for(int i = 0;i<included.length;i++) {
    		if(i==0) {
    			includedInt[i]=a;
    		}else {
    			includedInt[i]=includedInt[i-1]+d;
    		}
    	}
    	
    	for(int i = 0;i<included.length;i++) {
    		if(included[i]==true) {
    			answer+=includedInt[i];
    		}
    	}
        return answer;
    }
}