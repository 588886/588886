class Solution {
    public int[] solution(int n) {
        String str=n+".";

		while(n!=1) {
			
			if(n%2==0) {
				n/=2;
				str+=n+".";
			}else if(n%2==1) {
				n=(n*3)+1;
				str+=n+".";
			}
			
			
		}
		
		String[] st=str.split("\\.");
		int[] answer= new int[st.length];
		for(int i = 0; i<st.length;i++) {
			answer[i]=Integer.parseInt(st[i]);
		}
        return answer;
    }
}