class Solution {
    public int solution(int[] num_list) {
        int result1=0;
    	int result2=1;
    	for(int i=0;i<num_list.length;i++) {
    		result1+=num_list[i];
    		result2*=num_list[i];
    	}
    	
        int answer = (result1*result1)<result2 ? 0:1;
        return answer;
    }
}