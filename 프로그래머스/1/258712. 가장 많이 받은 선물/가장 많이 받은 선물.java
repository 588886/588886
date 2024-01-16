import java.util.Arrays;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        String[][] gift=new String[gifts.length][2];
		int[][] f_g=new int[friends.length][friends.length];
		int[] answer=new int[friends.length];
		for(int i=0;i<gifts.length;i++) {
			gift[i]=gifts[i].split(" ");
		}
		
		
		for(int i=0;i<gift.length;i++) {
			f_g[Arrays.asList(friends).indexOf(gift[i][0])][Arrays.asList(friends).indexOf(gift[i][1])]++;
		}
		
		int[] gift_score=new int[friends.length];
		
		for(int i=0;i<friends.length;i++) {
			for(int i1=0;i1<friends.length;i1++) {
				gift_score[i]+=f_g[i][i1];
				gift_score[i]-=f_g[i1][i];
			}
		}
		
		for(int i=0;i<friends.length;i++) {
			for(int i1=0;i1<friends.length;i1++) {
				if(i!=i1) {
					if(f_g[i][i1]>f_g[i1][i]) {
						answer[i]++;
					}else if(f_g[i][i1]<f_g[i1][i]) {
						answer[i1]++;
					}else {
						if(gift_score[i]>gift_score[i1]) {
							answer[i]++;
						}else if(gift_score[i]<gift_score[i1]) {
							answer[i1]++;
						}
					}
				}
			}
		}
		
		Arrays.sort(answer);
        
        return answer[answer.length-1]/2;
        
    }
}