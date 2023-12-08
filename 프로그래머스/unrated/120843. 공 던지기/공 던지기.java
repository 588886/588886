class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i=0;
		while(true) {
            
			i++;
			if(i==numbers.length)i=0;
			i++;
			if(i==numbers.length)i=0;
			k--;
            if(k==1) {
				answer=numbers[i];
				break;
			}
			
			
		}
        return answer;
    }
}