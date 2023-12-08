import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[][] score) {
        Integer scoSum[]=new Integer[score.length];
		int answer[]=new int[score.length];
		int answer1[]=new int[score.length];
		for(int i=0;i<score.length;i++) {
			scoSum[i]=score[i][0]+score[i][1];
			answer[i]=score[i][0]+score[i][1];
		}
		Arrays.sort(scoSum,Collections.reverseOrder());
		for(int i=0;i<score.length;i++) {
			for(int i1=0;i1<score.length;i1++) {
				if(scoSum[i]==answer[i1]) {
					if(i==0) {
						answer1[i1]=i+1;
						answer[i1]=-1;
						i=0;
					}else if(i!=0&&scoSum[i]!=scoSum[i-1]) {
						answer1[i1]=i+1;
						answer[i1]=-1;
						i=0;
					}
				}
			}
		}
        return answer1;
    }
}