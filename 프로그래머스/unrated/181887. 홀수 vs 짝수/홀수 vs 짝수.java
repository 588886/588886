class Solution {
    public int solution(int[] num_list) {
        int no1 =0;
		int no2 =0;
		int answer = 0;
		for(int i = 0 ; i<num_list.length;i++ ) {
			
			if(i%2==0) {
				no1+=num_list[i];
			}else {
				no2+=num_list[i];
			}
			
		}
		
		if(no1>no2) {
			answer = no1;
		}else if(no1==no2) {
			answer = no1;
		}else {
			answer = no2;
		}
        return answer;
    }
}