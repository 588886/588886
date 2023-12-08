class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++) {
			
			for(int i1=0;i1<100;i1++) {
				
				if(num_list[i]==1) {
					break;
				}else if(num_list[i]%2==1) {
					num_list[i]=(num_list[i]-1)/2;
					answer++;
				}else {
					num_list[i]/=2;
					answer++;
				}
				
			}
			
		}
        return answer;
    }
}