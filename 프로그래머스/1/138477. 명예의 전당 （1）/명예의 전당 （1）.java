import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] topK=new int[k];
		for(int i=0;i<topK.length;i++) {
			topK[i]=2000;
		}
		int[] answer=new int[score.length];
		
		for(int i=0;i<answer.length;i++) {
			if(i<k) {
				topK[i]=score[i];
				Arrays.sort(topK);
				answer[i]=topK[0];
			}else {
				if(score[i]>topK[0]) {
					topK[0]=score[i];
					Arrays.sort(topK);
					answer[i]=topK[0];
				}else {
					answer[i]=topK[0];
				}
			}
		}
        return answer;
    }
}