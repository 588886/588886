class Solution {
    public int[] solution(int num, int total) {
        int[] answer=new int[num];
		for(int i=-1000;i<1000;i++) {
			int cnt=0;
			for(int i1=i;i1<i+num;i1++) {
				cnt+=i1;
			}
			if(cnt==total) {
				for(int i1=i;i1<i+num;i1++) {
					answer[i1-i]=i1;
				}
			}
		}
        return answer;
    }
}