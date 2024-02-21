class Solution {
    public int solution(int number, int limit, int power) {
        int result=0;
		for(int j=1;j<=number;j++) {
            int answer=0;
            if(j%2==0) {
			    for(int i=1;i<=(j/2)-1;i++) {if(j%i==0)answer++;}
			    answer+=2;
		    }else {
                for(int i=1;i<=j/2;i++) {
                    if(j%i==0)answer++;}
            answer++;}
			result+=answer>limit ? power:answer;
		}
        return result;
    }
}