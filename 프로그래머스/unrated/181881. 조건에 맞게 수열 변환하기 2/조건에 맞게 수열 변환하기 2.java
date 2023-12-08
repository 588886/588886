class Solution {
    public int solution(int[] arr) {
        int answer=-1;
		boolean a = true;
		
		while(a) {
			a = false;
			
			for(int i = 0; i<arr.length;i++) {
				
				if((arr[i]>=50)&&(arr[i]%2==0)) {
					arr[i]/=2;
					a=true;
				}else if((arr[i]<50)&&(arr[i]%2==1)) {
					arr[i]=(arr[i]*2)+1;
					a=true;
				}else {
					
				}
				
			}
			answer++;
		}
		
        return answer;
    }
}