class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Num=0;
		int card2Num=0;
		boolean result=true;
		for(String str:goal) {
			result=false;
			if(card1Num<cards1.length) {
				if(str.equals(cards1[card1Num])) {
					card1Num++;
					result=true;
				}
			}
			if(card2Num<cards2.length) {
				if(str.equals(cards2[card2Num])) {
					card2Num++;
					result=true;
				}
			}
			if(result==false)break;
		}
        return result ? "Yes":"No";
    }
}