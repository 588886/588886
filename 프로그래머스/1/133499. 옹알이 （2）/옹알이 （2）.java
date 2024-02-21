class Solution {
    public int solution(String[] babbling) {
        int answer=0;
		for(String str:babbling) {
			if(str.contains("aya")&&!str.contains("ayaaya")) str=str.replace("aya","Q");
			if(str.contains("ye")&&!str.contains("yeye")) str=str.replace("ye", "Q");
			if(str.contains("woo")&&!str.contains("woowoo")) str=str.replace("woo","Q");
			if(str.contains("ma")&&!str.contains("mama")) str=str.replace("ma", "Q");
			str=str.replace("Q", "");
			if(str.equals("")) answer++;
		}
        return answer;
    }
}